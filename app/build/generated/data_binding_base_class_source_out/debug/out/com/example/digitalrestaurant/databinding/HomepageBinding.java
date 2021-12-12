// Generated by view binder compiler. Do not edit!
package com.example.digitalrestaurant.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
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

public final class HomepageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ConstraintLayout constraintLayout3;

  @NonNull
  public final TextView customerWelcomeName;

  @NonNull
  public final RecyclerView locationRecycler;

  @NonNull
  public final TextView menuKeyS;

  @NonNull
  public final RecyclerView obandeKitchen;

  @NonNull
  public final RecyclerView restaurantsRecycler;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView8;

  private HomepageBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout3,
      @NonNull TextView customerWelcomeName, @NonNull RecyclerView locationRecycler,
      @NonNull TextView menuKeyS, @NonNull RecyclerView obandeKitchen,
      @NonNull RecyclerView restaurantsRecycler, @NonNull ScrollView scrollView2,
      @NonNull TextView textView, @NonNull TextView textView19, @NonNull TextView textView8) {
    this.rootView = rootView;
    this.constraintLayout = constraintLayout;
    this.constraintLayout3 = constraintLayout3;
    this.customerWelcomeName = customerWelcomeName;
    this.locationRecycler = locationRecycler;
    this.menuKeyS = menuKeyS;
    this.obandeKitchen = obandeKitchen;
    this.restaurantsRecycler = restaurantsRecycler;
    this.scrollView2 = scrollView2;
    this.textView = textView;
    this.textView19 = textView19;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HomepageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomepageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.homepage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomepageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.constraintLayout3;
      ConstraintLayout constraintLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout3 == null) {
        break missingId;
      }

      id = R.id.customerWelcomeName;
      TextView customerWelcomeName = ViewBindings.findChildViewById(rootView, id);
      if (customerWelcomeName == null) {
        break missingId;
      }

      id = R.id.locationRecycler;
      RecyclerView locationRecycler = ViewBindings.findChildViewById(rootView, id);
      if (locationRecycler == null) {
        break missingId;
      }

      id = R.id.menuKeyS;
      TextView menuKeyS = ViewBindings.findChildViewById(rootView, id);
      if (menuKeyS == null) {
        break missingId;
      }

      id = R.id.obandeKitchen;
      RecyclerView obandeKitchen = ViewBindings.findChildViewById(rootView, id);
      if (obandeKitchen == null) {
        break missingId;
      }

      id = R.id.restaurantsRecycler;
      RecyclerView restaurantsRecycler = ViewBindings.findChildViewById(rootView, id);
      if (restaurantsRecycler == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      return new HomepageBinding((ConstraintLayout) rootView, constraintLayout, constraintLayout3,
          customerWelcomeName, locationRecycler, menuKeyS, obandeKitchen, restaurantsRecycler,
          scrollView2, textView, textView19, textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
