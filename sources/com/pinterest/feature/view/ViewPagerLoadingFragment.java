package com.pinterest.feature.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import dl2.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/pinterest/feature/view/ViewPagerLoadingFragment;", "Ljl1/a;", "<init>", "()V", "ViewPagerLoadingLocation", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ViewPagerLoadingFragment extends ki1.a {

    /* renamed from: m, reason: collision with root package name */
    public GestaltSpinner f49050m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/view/ViewPagerLoadingFragment$ViewPagerLoadingLocation;", "Lcom/pinterest/framework/screens/ScreenLocation;", "CREATOR", "com/pinterest/feature/view/a", "closeup_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class ViewPagerLoadingLocation implements ScreenLocation {

        @NotNull
        public static final a CREATOR = new a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.pinterest.framework.screens.ScreenLocation
        public final String getName() {
            String simpleName = ViewPagerLoadingLocation.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return simpleName;
        }

        @Override // com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass */
        public final Class getF48308a() {
            return ViewPagerLoadingFragment.class;
        }

        @Override // com.pinterest.framework.screens.ScreenLocation
        public final void onScreenNavigation() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.f(viewGroup);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setBackgroundColor(b.y0(frameLayout, eo1.a.sema_color_background_default));
        return frameLayout;
    }
}
