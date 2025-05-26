package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import bs1.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import li.d;
import mi.b;

/* loaded from: classes3.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new d(23);

    /* renamed from: f, reason: collision with root package name */
    public Boolean f31884f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f31885g;

    /* renamed from: i, reason: collision with root package name */
    public CameraPosition f31887i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f31888j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f31889k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f31890l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f31891m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f31892n;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f31893o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f31894p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f31895q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f31896r;

    /* renamed from: v, reason: collision with root package name */
    public Boolean f31900v;

    /* renamed from: h, reason: collision with root package name */
    public int f31886h = -1;

    /* renamed from: s, reason: collision with root package name */
    public Float f31897s = null;

    /* renamed from: t, reason: collision with root package name */
    public Float f31898t = null;

    /* renamed from: u, reason: collision with root package name */
    public LatLngBounds f31899u = null;

    public static GoogleMapOptions e(Context context, AttributeSet attributeSet) {
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, b.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(b.MapAttrs_mapType)) {
            googleMapOptions.f31886h = obtainAttributes.getInt(b.MapAttrs_mapType, -1);
        }
        if (obtainAttributes.hasValue(b.MapAttrs_zOrderOnTop)) {
            googleMapOptions.f31884f = Boolean.valueOf(obtainAttributes.getBoolean(b.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(b.MapAttrs_useViewLifecycle)) {
            googleMapOptions.f31885g = Boolean.valueOf(obtainAttributes.getBoolean(b.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(b.MapAttrs_uiCompass)) {
            googleMapOptions.f31889k = Boolean.valueOf(obtainAttributes.getBoolean(b.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(b.MapAttrs_uiRotateGestures)) {
            googleMapOptions.f31893o = Boolean.valueOf(obtainAttributes.getBoolean(b.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(b.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
            googleMapOptions.f31900v = Boolean.valueOf(obtainAttributes.getBoolean(b.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
        }
        if (obtainAttributes.hasValue(b.MapAttrs_uiScrollGestures)) {
            googleMapOptions.f31890l = Boolean.valueOf(obtainAttributes.getBoolean(b.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(b.MapAttrs_uiTiltGestures)) {
            googleMapOptions.f31892n = Boolean.valueOf(obtainAttributes.getBoolean(b.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(b.MapAttrs_uiZoomGestures)) {
            googleMapOptions.f31891m = Boolean.valueOf(obtainAttributes.getBoolean(b.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(b.MapAttrs_uiZoomControls)) {
            googleMapOptions.f31888j = Boolean.valueOf(obtainAttributes.getBoolean(b.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(b.MapAttrs_liteMode)) {
            googleMapOptions.f31894p = Boolean.valueOf(obtainAttributes.getBoolean(b.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(b.MapAttrs_uiMapToolbar)) {
            googleMapOptions.f31895q = Boolean.valueOf(obtainAttributes.getBoolean(b.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(b.MapAttrs_ambientEnabled)) {
            googleMapOptions.f31896r = Boolean.valueOf(obtainAttributes.getBoolean(b.MapAttrs_ambientEnabled, false));
        }
        if (obtainAttributes.hasValue(b.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.f31897s = Float.valueOf(obtainAttributes.getFloat(b.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(b.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.f31898t = Float.valueOf(obtainAttributes.getFloat(b.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, b.MapAttrs);
        Float valueOf = obtainAttributes2.hasValue(b.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(obtainAttributes2.getFloat(b.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float valueOf2 = obtainAttributes2.hasValue(b.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(obtainAttributes2.getFloat(b.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float valueOf3 = obtainAttributes2.hasValue(b.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(obtainAttributes2.getFloat(b.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float valueOf4 = obtainAttributes2.hasValue(b.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(obtainAttributes2.getFloat(b.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        obtainAttributes2.recycle();
        if (valueOf != null && valueOf2 != null && valueOf3 != null && valueOf4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(valueOf.floatValue(), valueOf2.floatValue()), new LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
        }
        googleMapOptions.f31899u = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, b.MapAttrs);
        LatLng latLng = new LatLng(obtainAttributes3.hasValue(b.MapAttrs_cameraTargetLat) ? obtainAttributes3.getFloat(b.MapAttrs_cameraTargetLat, 0.0f) : 0.0f, obtainAttributes3.hasValue(b.MapAttrs_cameraTargetLng) ? obtainAttributes3.getFloat(b.MapAttrs_cameraTargetLng, 0.0f) : 0.0f);
        float f13 = obtainAttributes3.hasValue(b.MapAttrs_cameraZoom) ? obtainAttributes3.getFloat(b.MapAttrs_cameraZoom, 0.0f) : 0.0f;
        float f14 = obtainAttributes3.hasValue(b.MapAttrs_cameraBearing) ? obtainAttributes3.getFloat(b.MapAttrs_cameraBearing, 0.0f) : 0.0f;
        float f15 = obtainAttributes3.hasValue(b.MapAttrs_cameraTilt) ? obtainAttributes3.getFloat(b.MapAttrs_cameraTilt, 0.0f) : 0.0f;
        obtainAttributes3.recycle();
        googleMapOptions.f31887i = new CameraPosition(latLng, f13, f15, f14);
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        q4 q4Var = new q4(this);
        q4Var.m(Integer.valueOf(this.f31886h), "MapType");
        q4Var.m(this.f31894p, "LiteMode");
        q4Var.m(this.f31887i, "Camera");
        q4Var.m(this.f31889k, "CompassEnabled");
        q4Var.m(this.f31888j, "ZoomControlsEnabled");
        q4Var.m(this.f31890l, "ScrollGesturesEnabled");
        q4Var.m(this.f31891m, "ZoomGesturesEnabled");
        q4Var.m(this.f31892n, "TiltGesturesEnabled");
        q4Var.m(this.f31893o, "RotateGesturesEnabled");
        q4Var.m(this.f31900v, "ScrollGesturesEnabledDuringRotateOrZoom");
        q4Var.m(this.f31895q, "MapToolbarEnabled");
        q4Var.m(this.f31896r, "AmbientEnabled");
        q4Var.m(this.f31897s, "MinZoomPreference");
        q4Var.m(this.f31898t, "MaxZoomPreference");
        q4Var.m(this.f31899u, "LatLngBoundsForCameraTarget");
        q4Var.m(this.f31884f, "ZOrderOnTop");
        q4Var.m(this.f31885g, "UseViewLifecycleInFragment");
        return q4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int M2 = c.M2(parcel, 20293);
        byte q13 = ig1.b.q1(this.f31884f);
        c.O2(parcel, 2, 4);
        parcel.writeInt(q13);
        byte q14 = ig1.b.q1(this.f31885g);
        c.O2(parcel, 3, 4);
        parcel.writeInt(q14);
        int i14 = this.f31886h;
        c.O2(parcel, 4, 4);
        parcel.writeInt(i14);
        c.H2(parcel, 5, this.f31887i, i13, false);
        byte q15 = ig1.b.q1(this.f31888j);
        c.O2(parcel, 6, 4);
        parcel.writeInt(q15);
        byte q16 = ig1.b.q1(this.f31889k);
        c.O2(parcel, 7, 4);
        parcel.writeInt(q16);
        byte q17 = ig1.b.q1(this.f31890l);
        c.O2(parcel, 8, 4);
        parcel.writeInt(q17);
        byte q18 = ig1.b.q1(this.f31891m);
        c.O2(parcel, 9, 4);
        parcel.writeInt(q18);
        byte q19 = ig1.b.q1(this.f31892n);
        c.O2(parcel, 10, 4);
        parcel.writeInt(q19);
        byte q110 = ig1.b.q1(this.f31893o);
        c.O2(parcel, 11, 4);
        parcel.writeInt(q110);
        byte q111 = ig1.b.q1(this.f31894p);
        c.O2(parcel, 12, 4);
        parcel.writeInt(q111);
        byte q112 = ig1.b.q1(this.f31895q);
        c.O2(parcel, 14, 4);
        parcel.writeInt(q112);
        byte q113 = ig1.b.q1(this.f31896r);
        c.O2(parcel, 15, 4);
        parcel.writeInt(q113);
        c.D2(parcel, 16, this.f31897s);
        c.D2(parcel, 17, this.f31898t);
        c.H2(parcel, 18, this.f31899u, i13, false);
        byte q114 = ig1.b.q1(this.f31900v);
        c.O2(parcel, 19, 4);
        parcel.writeInt(q114);
        c.N2(parcel, M2);
    }
}
