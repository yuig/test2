package com.pinterest.stubs;

import android.os.Parcel;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s82.a;
import s82.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/stubs/StubScreenLocation;", "Lcom/pinterest/framework/screens/ScreenLocation;", "CREATOR", "s82/b", "screen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StubScreenLocation implements ScreenLocation {

    @NotNull
    public static final b CREATOR = new b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public final String getName() {
        return "stub";
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public final Class getScreenClass() {
        return a.class;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public final void onScreenNavigation() {
    }

    @Override // com.pinterest.framework.screens.ScreenLocation, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
    }
}
