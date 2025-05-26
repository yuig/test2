package com.pinterest.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import com.pinterest.api.model.v7;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.framework.screens.g;
import dl1.s;
import h32.d4;
import i2.u1;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import ml1.b;
import za.c;

/* loaded from: classes2.dex */
public interface Navigation extends Parcelable {
    public static final Parcelable.Creator<Navigation> CREATOR = new u1(28);

    static NavigationImpl L(ScreenLocation screenLocation, String str, int i13) {
        return new NavigationImpl(screenLocation, str, i13, new Bundle());
    }

    static NavigationImpl r0(ScreenLocation location, s sVar) {
        Intrinsics.checkNotNullParameter(location, "location");
        String id3 = sVar != null ? sVar.getId() : null;
        if (id3 == null) {
            id3 = "";
        }
        NavigationImpl navigationImpl = new NavigationImpl(location, id3, 0, 12);
        if (sVar != null) {
            navigationImpl.e(sVar);
        }
        return navigationImpl;
    }

    static c remove() {
        return new c(4);
    }

    static NavigationImpl v1(ScreenLocation screenLocation, Bundle bundle) {
        return new NavigationImpl(screenLocation, "", b.UNSPECIFIED_TRANSITION.getValue(), bundle);
    }

    static NavigationImpl w1(ScreenLocation screenLocation) {
        return new NavigationImpl(screenLocation, "", b.UNSPECIFIED_TRANSITION.getValue());
    }

    static NavigationImpl z0(ScreenLocation screenLocation, String str) {
        return new NavigationImpl(screenLocation, str, b.UNSPECIFIED_TRANSITION.getValue());
    }

    Parcelable A0();

    ArrayList D0();

    float D1(String str);

    void J0();

    int J1(String str);

    ArrayList M(String str);

    /* renamed from: O */
    Bundle getF49942d();

    v7 P1();

    ArrayList Q1(String str);

    boolean S(String str, boolean z13);

    long U(long j13);

    float V0();

    Object X0();

    void Y1(String str, boolean z13);

    Serializable Z0(String str, Serializable serializable);

    /* renamed from: a0 */
    d4 getF49944f();

    ScreenModel b1();

    Parcelable b2(String str);

    void d0(long j13, String str);

    ArrayList d2();

    String e1();

    /* renamed from: f2 */
    ScreenLocation getF49939a();

    String g2(String str, String str2);

    g getDisplayMode();

    /* renamed from: getId */
    String getF49940b();

    Object i0(String str);

    void m0(String str, String str2);

    int q1(int i13, String str);

    boolean r1();

    String v0(String str);

    boolean w(String str);

    void w0(Parcelable parcelable, String str);

    long x0();

    void y0(Object obj, String str);

    void z(int i13, String str);
}
