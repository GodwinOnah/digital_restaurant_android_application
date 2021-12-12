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

public final class ActivityStainlessPageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button stainlessClear;

  @NonNull
  public final RecyclerView stainlessMainRecyclerView;

  @NonNull
  public final TextView textView6;

  private ActivityStainlessPageBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button stainlessClear, @NonNull RecyclerView stainlessMainRecyclerView,
      @NonNull TextView textView6) {
    this.rootView = rootView;
    this.stainlessClear = stainlessClear;
    this.stainlessMainRecyclerView = stainlessMainRecyclerView;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityStainlessPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityStainlessPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_stainless_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityStainlessPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.stainlessClear;
      Button stainlessClear = ViewBindings.findChildViewById(rootView, id);
      if (stainlessClear == null) {
        break missingId;
      }

      id = R.id.stainlessMainRecyclerView;
      RecyclerView stainlessMainRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (stainlessMainRecyclerView == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      return new ActivityStainlessPageBinding((ConstraintLayout) rootView, stainlessClear,
          stainlessMainRecyclerView, textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
