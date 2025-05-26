package com.pinterest.framework.screens;

import android.os.Parcel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/pinterest/framework/screens/BlankScreen$BlankLocation", "Lcom/pinterest/framework/screens/ScreenLocation;", "CREATOR", "com/pinterest/framework/screens/c", "framework-screens_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class BlankScreen$BlankLocation implements ScreenLocation {

    @NotNull
    public static final c CREATOR = new c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getDisplayMode */
    public final g getF50396b() {
        return g.DEFAULT;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public final String getName() {
        String simpleName = BlankScreen$BlankLocation.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getScreenClass */
    public final Class getF48308a() {
        return d.class;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public final boolean getF48309b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public final boolean getF47454c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public final boolean getShouldShowMainNavigation() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public final boolean getF50415c() {
        return true;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public final void onScreenNavigation() {
    }

    @Override // com.pinterest.framework.screens.ScreenLocation, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
    }
}
