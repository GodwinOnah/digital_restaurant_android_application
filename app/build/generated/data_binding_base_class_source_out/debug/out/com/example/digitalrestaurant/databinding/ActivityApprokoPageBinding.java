// Generated by view binder compiler. Do not edit!
package com.example.digitalrestaurant.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.digitalrestaurant.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityApprokoPageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button Approkoclearer;

  @NonNull
  public final RecyclerView aPprokoMainRecyclerView;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  private ActivityApprokoPageBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button Approkoclearer, @NonNull RecyclerView aPprokoMainRecyclerView,
      @NonNull TextView textView6, @NonNull TextView textView7) {
    this.rootView = rootView;
    this.Approkoclearer = Approkoclearer;
    this.aPprokoMainRecyclerView = aPprokoMainRecyclerView;
    this.textView6 = textView6;
    this.textView7 = textView7;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityApprokoPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityApprokoPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_approko_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityApprokoPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Approkoclearer;
      Button Approkoclearer = ViewBindings.findChildViewById(rootView, id);
      if (Approkoclearer == null) {
        break missingId;
      }

      id = R.id.aPprokoMainRecyclerView;
      RecyclerView aPprokoMainRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (aPprokoMainRecyclerView == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      return new ActivityApprokoPageBinding((ConstraintLayout) rootView, Approkoclearer,
          aPprokoMainRecyclerView, textView6, textView7);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
