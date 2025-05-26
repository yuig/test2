package com.pinterest.framework.screens;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i2.u1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/framework/screens/ScreenModel;", "Lcom/pinterest/framework/screens/ScreenDescription;", "Landroid/os/Parcelable;", "ps0/m", "framework-screens_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class ScreenModel implements ScreenDescription, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final ScreenLocation f49205a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49206b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f49207c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f49208d;

    /* renamed from: e, reason: collision with root package name */
    public String f49209e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f49210f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f49211g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f49212h;

    /* renamed from: i, reason: collision with root package name */
    public static final ScreenModel f49204i = new ScreenModel(new BlankScreen$BlankLocation(), 0, null, null, null, 62);

    @NotNull
    public static final Parcelable.Creator<ScreenModel> CREATOR = new u1(26);

    public ScreenModel(ScreenLocation screenLocation, int i13, Bundle arguments, Bundle bundle, String uniqueId, int i14) {
        i13 = (i14 & 2) != 0 ? 0 : i13;
        arguments = (i14 & 4) != 0 ? new Bundle() : arguments;
        bundle = (i14 & 8) != 0 ? null : bundle;
        uniqueId = (i14 & 16) != 0 ? "" : uniqueId;
        LinkedHashMap results = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(screenLocation, "screenLocation");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        Intrinsics.checkNotNullParameter(results, "results");
        this.f49205a = screenLocation;
        this.f49206b = i13;
        this.f49207c = arguments;
        this.f49208d = bundle;
        this.f49209e = uniqueId;
        this.f49210f = results;
        this.f49211g = true;
        this.f49212h = screenLocation.getSupportsStateRestorationOnlyUseInEmergencies();
    }

    @Override // com.pinterest.framework.screens.ScreenDescription
    /* renamed from: A, reason: from getter */
    public final String getF49209e() {
        return this.f49209e;
    }

    @Override // com.pinterest.framework.screens.ScreenDescription
    /* renamed from: H0, reason: from getter */
    public final Map getF49210f() {
        return this.f49210f;
    }

    @Override // com.pinterest.framework.screens.ScreenDescription
    public final String L1() {
        return this.f49205a.toString();
    }

    @Override // com.pinterest.framework.screens.ScreenDescription
    /* renamed from: O1, reason: from getter */
    public final Bundle getF49207c() {
        return this.f49207c;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f49209e = str;
    }

    @Override // com.pinterest.framework.screens.ScreenDescription
    /* renamed from: c, reason: from getter */
    public final int getF49206b() {
        return this.f49206b;
    }

    @Override // com.pinterest.framework.screens.ScreenDescription
    public final void c2(Bundle bundle) {
        this.f49208d = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScreenDescription)) {
            return false;
        }
        ScreenDescription screenDescription = (ScreenDescription) obj;
        return Intrinsics.d(screenDescription.getScreenClass(), this.f49205a.getF51724a()) && ps0.m.c(screenDescription.getF49207c(), this.f49207c) && Intrinsics.d(screenDescription.getF49209e(), this.f49209e) && screenDescription.getF49206b() == this.f49206b;
    }

    @Override // com.pinterest.framework.screens.ScreenDescription
    /* renamed from: g0, reason: from getter */
    public final boolean getF49211g() {
        return this.f49211g;
    }

    @Override // com.pinterest.framework.screens.ScreenDescription
    public final Class getScreenClass() {
        return this.f49205a.getF51724a();
    }

    @Override // com.pinterest.framework.screens.ScreenDescription
    /* renamed from: getSupportsStateRestorationOnlyUseInEmergencies, reason: from getter */
    public final boolean getF49212h() {
        return this.f49212h;
    }

    public final int hashCode() {
        return Objects.hash(this.f49205a.getF51724a(), Integer.valueOf(this.f49207c.size()), this.f49209e, Integer.valueOf(this.f49206b));
    }

    @Override // com.pinterest.framework.screens.ScreenDescription
    /* renamed from: l1, reason: from getter */
    public final Bundle getF49208d() {
        return this.f49208d;
    }

    public final String toString() {
        return "ScreenModel(screenLocation=" + this.f49205a + ", screenTransitionId=" + this.f49206b + ", arguments=" + this.f49207c + ", instanceState=" + this.f49208d + ", uniqueId=" + this.f49209e + ", results=" + this.f49210f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f49205a, i13);
        dest.writeInt(this.f49206b);
        dest.writeBundle(this.f49207c);
        dest.writeBundle(this.f49208d);
        dest.writeInt(this.f49211g ? 1 : 0);
        dest.writeString(this.f49209e);
    }
}
