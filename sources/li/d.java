package li;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import bb.p;
import com.google.android.gms.internal.location.zzbh;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.zzj;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.measurement.internal.zzad;
import com.google.android.gms.measurement.internal.zzam;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zznc;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class d implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f83534a;

    public /* synthetic */ d(int i13) {
        this.f83534a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ii.a cVar;
        long j13 = 0;
        switch (this.f83534a) {
            case 0:
                int i13 = 0;
                int r03 = bf.b.r0(parcel);
                int i14 = 0;
                while (parcel.dataPosition() < r03) {
                    int readInt = parcel.readInt();
                    char c13 = (char) readInt;
                    if (c13 == 1) {
                        i14 = bf.b.h0(parcel, readInt);
                    } else if (c13 != 2) {
                        bf.b.p0(parcel, readInt);
                    } else {
                        i13 = bf.b.h0(parcel, readInt);
                    }
                }
                bf.b.L(parcel, r03);
                DetectedActivity detectedActivity = new DetectedActivity();
                detectedActivity.f31833f = i14;
                detectedActivity.f31834g = i13;
                return detectedActivity;
            case 1:
                int r04 = bf.b.r0(parcel);
                int i15 = Integer.MAX_VALUE;
                float f13 = 0.0f;
                long j14 = 50;
                long j15 = Long.MAX_VALUE;
                boolean z13 = true;
                while (parcel.dataPosition() < r04) {
                    int readInt2 = parcel.readInt();
                    char c14 = (char) readInt2;
                    if (c14 == 1) {
                        z13 = bf.b.a0(parcel, readInt2);
                    } else if (c14 == 2) {
                        j14 = bf.b.j0(parcel, readInt2);
                    } else if (c14 == 3) {
                        f13 = bf.b.e0(parcel, readInt2);
                    } else if (c14 == 4) {
                        j15 = bf.b.j0(parcel, readInt2);
                    } else if (c14 != 5) {
                        bf.b.p0(parcel, readInt2);
                    } else {
                        i15 = bf.b.h0(parcel, readInt2);
                    }
                }
                bf.b.L(parcel, r04);
                return new zzj(z13, j14, f13, j15, i15);
            case 2:
                int r05 = bf.b.r0(parcel);
                int i16 = 0;
                ArrayList arrayList = null;
                String str = "";
                while (parcel.dataPosition() < r05) {
                    int readInt3 = parcel.readInt();
                    char c15 = (char) readInt3;
                    if (c15 == 1) {
                        arrayList = bf.b.J(parcel, readInt3, zzbh.CREATOR);
                    } else if (c15 == 2) {
                        i16 = bf.b.h0(parcel, readInt3);
                    } else if (c15 != 3) {
                        bf.b.p0(parcel, readInt3);
                    } else {
                        str = bf.b.F(parcel, readInt3);
                    }
                }
                bf.b.L(parcel, r05);
                return new GeofencingRequest(i16, str, arrayList);
            case 3:
                int r06 = bf.b.r0(parcel);
                float f14 = 0.0f;
                float f15 = 0.0f;
                LatLng latLng = null;
                float f16 = 0.0f;
                while (parcel.dataPosition() < r06) {
                    int readInt4 = parcel.readInt();
                    char c16 = (char) readInt4;
                    if (c16 == 2) {
                        latLng = (LatLng) bf.b.E(parcel, readInt4, LatLng.CREATOR);
                    } else if (c16 == 3) {
                        f15 = bf.b.e0(parcel, readInt4);
                    } else if (c16 == 4) {
                        f16 = bf.b.e0(parcel, readInt4);
                    } else if (c16 != 5) {
                        bf.b.p0(parcel, readInt4);
                    } else {
                        f14 = bf.b.e0(parcel, readInt4);
                    }
                }
                bf.b.L(parcel, r06);
                return new CameraPosition(latLng, f15, f16, f14);
            case 4:
                int r07 = bf.b.r0(parcel);
                IBinder iBinder = null;
                Float f17 = null;
                int i17 = 0;
                while (parcel.dataPosition() < r07) {
                    int readInt5 = parcel.readInt();
                    char c17 = (char) readInt5;
                    if (c17 == 2) {
                        i17 = bf.b.h0(parcel, readInt5);
                    } else if (c17 == 3) {
                        iBinder = bf.b.g0(parcel, readInt5);
                    } else if (c17 != 4) {
                        bf.b.p0(parcel, readInt5);
                    } else {
                        f17 = bf.b.f0(parcel, readInt5);
                    }
                }
                bf.b.L(parcel, r07);
                return new Cap(i17, iBinder == null ? null : new p(rh.b.D(iBinder)), f17);
            case 5:
                ArrayList arrayList2 = null;
                int r08 = bf.b.r0(parcel);
                float f18 = 0.0f;
                float f19 = 0.0f;
                int i18 = 0;
                boolean z14 = false;
                boolean z15 = false;
                int i19 = 0;
                double d2 = 0.0d;
                LatLng latLng2 = null;
                while (parcel.dataPosition() < r08) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            latLng2 = (LatLng) bf.b.E(parcel, readInt6, LatLng.CREATOR);
                            break;
                        case 3:
                            d2 = bf.b.c0(parcel, readInt6);
                            break;
                        case 4:
                            f19 = bf.b.e0(parcel, readInt6);
                            break;
                        case 5:
                            i19 = bf.b.h0(parcel, readInt6);
                            break;
                        case 6:
                            i18 = bf.b.h0(parcel, readInt6);
                            break;
                        case 7:
                            f18 = bf.b.e0(parcel, readInt6);
                            break;
                        case '\b':
                            z14 = bf.b.a0(parcel, readInt6);
                            break;
                        case '\t':
                            z15 = bf.b.a0(parcel, readInt6);
                            break;
                        case '\n':
                            arrayList2 = bf.b.J(parcel, readInt6, PatternItem.CREATOR);
                            break;
                        default:
                            bf.b.p0(parcel, readInt6);
                            break;
                    }
                }
                bf.b.L(parcel, r08);
                CircleOptions circleOptions = new CircleOptions();
                circleOptions.f31918f = latLng2;
                circleOptions.f31919g = d2;
                circleOptions.f31920h = f19;
                circleOptions.f31921i = i19;
                circleOptions.f31922j = i18;
                circleOptions.f31923k = f18;
                circleOptions.f31924l = z14;
                circleOptions.f31925m = z15;
                circleOptions.f31926n = arrayList2;
                return circleOptions;
            case 6:
                int r09 = bf.b.r0(parcel);
                IBinder iBinder2 = null;
                LatLng latLng3 = null;
                LatLngBounds latLngBounds = null;
                float f23 = 0.0f;
                float f24 = 0.0f;
                float f25 = 0.0f;
                float f26 = 0.0f;
                boolean z16 = false;
                float f27 = 0.0f;
                float f28 = 0.0f;
                float f29 = 0.0f;
                boolean z17 = false;
                while (parcel.dataPosition() < r09) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            iBinder2 = bf.b.g0(parcel, readInt7);
                            break;
                        case 3:
                            latLng3 = (LatLng) bf.b.E(parcel, readInt7, LatLng.CREATOR);
                            break;
                        case 4:
                            f23 = bf.b.e0(parcel, readInt7);
                            break;
                        case 5:
                            f24 = bf.b.e0(parcel, readInt7);
                            break;
                        case 6:
                            latLngBounds = (LatLngBounds) bf.b.E(parcel, readInt7, LatLngBounds.CREATOR);
                            break;
                        case 7:
                            f25 = bf.b.e0(parcel, readInt7);
                            break;
                        case '\b':
                            f26 = bf.b.e0(parcel, readInt7);
                            break;
                        case '\t':
                            z16 = bf.b.a0(parcel, readInt7);
                            break;
                        case '\n':
                            f27 = bf.b.e0(parcel, readInt7);
                            break;
                        case 11:
                            f28 = bf.b.e0(parcel, readInt7);
                            break;
                        case '\f':
                            f29 = bf.b.e0(parcel, readInt7);
                            break;
                        case '\r':
                            z17 = bf.b.a0(parcel, readInt7);
                            break;
                        default:
                            bf.b.p0(parcel, readInt7);
                            break;
                    }
                }
                bf.b.L(parcel, r09);
                GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
                groundOverlayOptions.f31934m = true;
                groundOverlayOptions.f31935n = 0.0f;
                groundOverlayOptions.f31936o = 0.5f;
                groundOverlayOptions.f31937p = 0.5f;
                groundOverlayOptions.f31938q = false;
                groundOverlayOptions.f31927f = new p(rh.b.D(iBinder2));
                groundOverlayOptions.f31928g = latLng3;
                groundOverlayOptions.f31929h = f23;
                groundOverlayOptions.f31930i = f24;
                groundOverlayOptions.f31931j = latLngBounds;
                groundOverlayOptions.f31932k = f25;
                groundOverlayOptions.f31933l = f26;
                groundOverlayOptions.f31934m = z16;
                groundOverlayOptions.f31935n = f27;
                groundOverlayOptions.f31936o = f28;
                groundOverlayOptions.f31937p = f29;
                groundOverlayOptions.f31938q = z17;
                return groundOverlayOptions;
            case 7:
                LatLng latLng4 = null;
                int r010 = bf.b.r0(parcel);
                LatLng latLng5 = null;
                while (parcel.dataPosition() < r010) {
                    int readInt8 = parcel.readInt();
                    char c18 = (char) readInt8;
                    if (c18 == 2) {
                        latLng4 = (LatLng) bf.b.E(parcel, readInt8, LatLng.CREATOR);
                    } else if (c18 != 3) {
                        bf.b.p0(parcel, readInt8);
                    } else {
                        latLng5 = (LatLng) bf.b.E(parcel, readInt8, LatLng.CREATOR);
                    }
                }
                bf.b.L(parcel, r010);
                return new LatLngBounds(latLng4, latLng5);
            case 8:
                int r011 = bf.b.r0(parcel);
                double d13 = 0.0d;
                double d14 = 0.0d;
                while (parcel.dataPosition() < r011) {
                    int readInt9 = parcel.readInt();
                    char c19 = (char) readInt9;
                    if (c19 == 2) {
                        d13 = bf.b.c0(parcel, readInt9);
                    } else if (c19 != 3) {
                        bf.b.p0(parcel, readInt9);
                    } else {
                        d14 = bf.b.c0(parcel, readInt9);
                    }
                }
                bf.b.L(parcel, r011);
                return new LatLng(d13, d14);
            case 9:
                String str2 = null;
                int r012 = bf.b.r0(parcel);
                while (parcel.dataPosition() < r012) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 2) {
                        bf.b.p0(parcel, readInt10);
                    } else {
                        str2 = bf.b.F(parcel, readInt10);
                    }
                }
                bf.b.L(parcel, r012);
                MapStyleOptions mapStyleOptions = new MapStyleOptions();
                mapStyleOptions.f31943f = str2;
                return mapStyleOptions;
            case 10:
                int r013 = bf.b.r0(parcel);
                float f33 = 1.0f;
                float f34 = 0.5f;
                LatLng latLng6 = null;
                String str3 = null;
                String str4 = null;
                IBinder iBinder3 = null;
                float f35 = 0.0f;
                float f36 = 0.0f;
                float f37 = 0.0f;
                float f38 = 0.0f;
                float f39 = 0.0f;
                boolean z18 = false;
                boolean z19 = false;
                boolean z23 = false;
                while (parcel.dataPosition() < r013) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            latLng6 = (LatLng) bf.b.E(parcel, readInt11, LatLng.CREATOR);
                            break;
                        case 3:
                            str3 = bf.b.F(parcel, readInt11);
                            break;
                        case 4:
                            str4 = bf.b.F(parcel, readInt11);
                            break;
                        case 5:
                            iBinder3 = bf.b.g0(parcel, readInt11);
                            break;
                        case 6:
                            f35 = bf.b.e0(parcel, readInt11);
                            break;
                        case 7:
                            f36 = bf.b.e0(parcel, readInt11);
                            break;
                        case '\b':
                            z18 = bf.b.a0(parcel, readInt11);
                            break;
                        case '\t':
                            z19 = bf.b.a0(parcel, readInt11);
                            break;
                        case '\n':
                            z23 = bf.b.a0(parcel, readInt11);
                            break;
                        case 11:
                            f37 = bf.b.e0(parcel, readInt11);
                            break;
                        case '\f':
                            f34 = bf.b.e0(parcel, readInt11);
                            break;
                        case '\r':
                            f38 = bf.b.e0(parcel, readInt11);
                            break;
                        case 14:
                            f33 = bf.b.e0(parcel, readInt11);
                            break;
                        case 15:
                            f39 = bf.b.e0(parcel, readInt11);
                            break;
                        default:
                            bf.b.p0(parcel, readInt11);
                            break;
                    }
                }
                bf.b.L(parcel, r013);
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.f31948j = 0.5f;
                markerOptions.f31949k = 1.0f;
                markerOptions.f31951m = true;
                markerOptions.f31952n = false;
                markerOptions.f31953o = 0.0f;
                markerOptions.f31954p = 0.5f;
                markerOptions.f31955q = 0.0f;
                markerOptions.f31956r = 1.0f;
                markerOptions.f31944f = latLng6;
                markerOptions.f31945g = str3;
                markerOptions.f31946h = str4;
                if (iBinder3 == null) {
                    markerOptions.f31947i = null;
                } else {
                    markerOptions.f31947i = new p(rh.b.D(iBinder3));
                }
                markerOptions.f31948j = f35;
                markerOptions.f31949k = f36;
                markerOptions.f31950l = z18;
                markerOptions.f31951m = z19;
                markerOptions.f31952n = z23;
                markerOptions.f31953o = f37;
                markerOptions.f31954p = f34;
                markerOptions.f31955q = f38;
                markerOptions.f31956r = f33;
                markerOptions.f31957s = f39;
                return markerOptions;
            case 11:
                int r014 = bf.b.r0(parcel);
                Float f41 = null;
                int i23 = 0;
                while (parcel.dataPosition() < r014) {
                    int readInt12 = parcel.readInt();
                    char c23 = (char) readInt12;
                    if (c23 == 2) {
                        i23 = bf.b.h0(parcel, readInt12);
                    } else if (c23 != 3) {
                        bf.b.p0(parcel, readInt12);
                    } else {
                        f41 = bf.b.f0(parcel, readInt12);
                    }
                }
                bf.b.L(parcel, r014);
                return new PatternItem(i23, f41);
            case 12:
                int r015 = bf.b.r0(parcel);
                LatLng latLng7 = null;
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < r015) {
                    int readInt13 = parcel.readInt();
                    char c24 = (char) readInt13;
                    if (c24 == 2) {
                        latLng7 = (LatLng) bf.b.E(parcel, readInt13, LatLng.CREATOR);
                    } else if (c24 == 3) {
                        str5 = bf.b.F(parcel, readInt13);
                    } else if (c24 != 4) {
                        bf.b.p0(parcel, readInt13);
                    } else {
                        str6 = bf.b.F(parcel, readInt13);
                    }
                }
                bf.b.L(parcel, r015);
                return new PointOfInterest(latLng7, str5, str6);
            case 13:
                int r016 = bf.b.r0(parcel);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = null;
                float f43 = 0.0f;
                int i24 = 0;
                int i25 = 0;
                float f44 = 0.0f;
                boolean z24 = false;
                boolean z25 = false;
                boolean z26 = false;
                int i26 = 0;
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < r016) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            arrayList4 = bf.b.J(parcel, readInt14, LatLng.CREATOR);
                            break;
                        case 3:
                            ClassLoader classLoader = d.class.getClassLoader();
                            int l03 = bf.b.l0(parcel, readInt14);
                            int dataPosition = parcel.dataPosition();
                            if (l03 != 0) {
                                parcel.readList(arrayList3, classLoader);
                                parcel.setDataPosition(dataPosition + l03);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            f43 = bf.b.e0(parcel, readInt14);
                            break;
                        case 5:
                            i24 = bf.b.h0(parcel, readInt14);
                            break;
                        case 6:
                            i25 = bf.b.h0(parcel, readInt14);
                            break;
                        case 7:
                            f44 = bf.b.e0(parcel, readInt14);
                            break;
                        case '\b':
                            z24 = bf.b.a0(parcel, readInt14);
                            break;
                        case '\t':
                            z25 = bf.b.a0(parcel, readInt14);
                            break;
                        case '\n':
                            z26 = bf.b.a0(parcel, readInt14);
                            break;
                        case 11:
                            i26 = bf.b.h0(parcel, readInt14);
                            break;
                        case '\f':
                            arrayList5 = bf.b.J(parcel, readInt14, PatternItem.CREATOR);
                            break;
                        default:
                            bf.b.p0(parcel, readInt14);
                            break;
                    }
                }
                bf.b.L(parcel, r016);
                return new PolygonOptions(arrayList4, arrayList3, f43, i24, i25, f44, z24, z25, z26, i26, arrayList5);
            case 14:
                int r017 = bf.b.r0(parcel);
                ArrayList arrayList6 = null;
                float f45 = 0.0f;
                int i27 = 0;
                float f46 = 0.0f;
                boolean z27 = false;
                boolean z28 = false;
                boolean z29 = false;
                Cap cap = null;
                Cap cap2 = null;
                int i28 = 0;
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < r017) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 2:
                            arrayList6 = bf.b.J(parcel, readInt15, LatLng.CREATOR);
                            break;
                        case 3:
                            f45 = bf.b.e0(parcel, readInt15);
                            break;
                        case 4:
                            i27 = bf.b.h0(parcel, readInt15);
                            break;
                        case 5:
                            f46 = bf.b.e0(parcel, readInt15);
                            break;
                        case 6:
                            z27 = bf.b.a0(parcel, readInt15);
                            break;
                        case 7:
                            z28 = bf.b.a0(parcel, readInt15);
                            break;
                        case '\b':
                            z29 = bf.b.a0(parcel, readInt15);
                            break;
                        case '\t':
                            cap = (Cap) bf.b.E(parcel, readInt15, Cap.CREATOR);
                            break;
                        case '\n':
                            cap2 = (Cap) bf.b.E(parcel, readInt15, Cap.CREATOR);
                            break;
                        case 11:
                            i28 = bf.b.h0(parcel, readInt15);
                            break;
                        case '\f':
                            arrayList7 = bf.b.J(parcel, readInt15, PatternItem.CREATOR);
                            break;
                        default:
                            bf.b.p0(parcel, readInt15);
                            break;
                    }
                }
                bf.b.L(parcel, r017);
                return new PolylineOptions(arrayList6, f45, i27, f46, z27, z28, z29, cap, cap2, i28, arrayList7);
            case 15:
                int r018 = bf.b.r0(parcel);
                float f47 = 0.0f;
                float f48 = 0.0f;
                float f49 = 0.0f;
                while (parcel.dataPosition() < r018) {
                    int readInt16 = parcel.readInt();
                    char c25 = (char) readInt16;
                    if (c25 == 2) {
                        f49 = bf.b.e0(parcel, readInt16);
                    } else if (c25 == 3) {
                        f47 = bf.b.e0(parcel, readInt16);
                    } else if (c25 != 4) {
                        bf.b.p0(parcel, readInt16);
                    } else {
                        f48 = bf.b.e0(parcel, readInt16);
                    }
                }
                bf.b.L(parcel, r018);
                return new StreetViewPanoramaCamera(f49, f47, f48);
            case 16:
                int r019 = bf.b.r0(parcel);
                String str7 = null;
                float f53 = 0.0f;
                while (parcel.dataPosition() < r019) {
                    int readInt17 = parcel.readInt();
                    char c26 = (char) readInt17;
                    if (c26 == 2) {
                        str7 = bf.b.F(parcel, readInt17);
                    } else if (c26 != 3) {
                        bf.b.p0(parcel, readInt17);
                    } else {
                        f53 = bf.b.e0(parcel, readInt17);
                    }
                }
                bf.b.L(parcel, r019);
                return new StreetViewPanoramaLink(str7, f53);
            case 17:
                int r020 = bf.b.r0(parcel);
                StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
                LatLng latLng8 = null;
                String str8 = null;
                while (parcel.dataPosition() < r020) {
                    int readInt18 = parcel.readInt();
                    char c27 = (char) readInt18;
                    if (c27 == 2) {
                        streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) bf.b.I(parcel, readInt18, StreetViewPanoramaLink.CREATOR);
                    } else if (c27 == 3) {
                        latLng8 = (LatLng) bf.b.E(parcel, readInt18, LatLng.CREATOR);
                    } else if (c27 != 4) {
                        bf.b.p0(parcel, readInt18);
                    } else {
                        str8 = bf.b.F(parcel, readInt18);
                    }
                }
                bf.b.L(parcel, r020);
                return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng8, str8);
            case 18:
                int r021 = bf.b.r0(parcel);
                float f54 = 0.0f;
                float f55 = 0.0f;
                while (parcel.dataPosition() < r021) {
                    int readInt19 = parcel.readInt();
                    char c28 = (char) readInt19;
                    if (c28 == 2) {
                        f55 = bf.b.e0(parcel, readInt19);
                    } else if (c28 != 3) {
                        bf.b.p0(parcel, readInt19);
                    } else {
                        f54 = bf.b.e0(parcel, readInt19);
                    }
                }
                bf.b.L(parcel, r021);
                return new StreetViewPanoramaOrientation(f55, f54);
            case 19:
                int r022 = bf.b.r0(parcel);
                int i29 = 0;
                while (parcel.dataPosition() < r022) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 2) {
                        bf.b.p0(parcel, readInt20);
                    } else {
                        i29 = bf.b.h0(parcel, readInt20);
                    }
                }
                bf.b.L(parcel, r022);
                return new StreetViewSource(i29);
            case 20:
                int r023 = bf.b.r0(parcel);
                byte[] bArr = null;
                int i33 = 0;
                int i34 = 0;
                while (parcel.dataPosition() < r023) {
                    int readInt21 = parcel.readInt();
                    char c29 = (char) readInt21;
                    if (c29 == 2) {
                        i34 = bf.b.h0(parcel, readInt21);
                    } else if (c29 == 3) {
                        i33 = bf.b.h0(parcel, readInt21);
                    } else if (c29 != 4) {
                        bf.b.p0(parcel, readInt21);
                    } else {
                        bArr = bf.b.C(parcel, readInt21);
                    }
                }
                bf.b.L(parcel, r023);
                return new Tile(bArr, i34, i33);
            case 21:
                int r024 = bf.b.r0(parcel);
                boolean z33 = true;
                IBinder iBinder4 = null;
                float f56 = 0.0f;
                float f57 = 0.0f;
                boolean z34 = false;
                while (parcel.dataPosition() < r024) {
                    int readInt22 = parcel.readInt();
                    char c33 = (char) readInt22;
                    if (c33 == 2) {
                        iBinder4 = bf.b.g0(parcel, readInt22);
                    } else if (c33 == 3) {
                        z34 = bf.b.a0(parcel, readInt22);
                    } else if (c33 == 4) {
                        f56 = bf.b.e0(parcel, readInt22);
                    } else if (c33 == 5) {
                        z33 = bf.b.a0(parcel, readInt22);
                    } else if (c33 != 6) {
                        bf.b.p0(parcel, readInt22);
                    } else {
                        f57 = bf.b.e0(parcel, readInt22);
                    }
                }
                bf.b.L(parcel, r024);
                TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
                tileOverlayOptions.f32001g = true;
                tileOverlayOptions.f32003i = true;
                tileOverlayOptions.f32004j = 0.0f;
                int i35 = ii.b.f72296a;
                if (iBinder4 == null) {
                    cVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder4.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    cVar = queryLocalInterface instanceof ii.a ? (ii.a) queryLocalInterface : new ii.c(iBinder4);
                }
                tileOverlayOptions.f32000f = cVar;
                tileOverlayOptions.f32001g = z34;
                tileOverlayOptions.f32002h = f56;
                tileOverlayOptions.f32003i = z33;
                tileOverlayOptions.f32004j = f57;
                return tileOverlayOptions;
            case 22:
                int r025 = bf.b.r0(parcel);
                LatLng latLng9 = null;
                LatLng latLng10 = null;
                LatLng latLng11 = null;
                LatLng latLng12 = null;
                LatLngBounds latLngBounds2 = null;
                while (parcel.dataPosition() < r025) {
                    int readInt23 = parcel.readInt();
                    char c34 = (char) readInt23;
                    if (c34 == 2) {
                        latLng9 = (LatLng) bf.b.E(parcel, readInt23, LatLng.CREATOR);
                    } else if (c34 == 3) {
                        latLng10 = (LatLng) bf.b.E(parcel, readInt23, LatLng.CREATOR);
                    } else if (c34 == 4) {
                        latLng11 = (LatLng) bf.b.E(parcel, readInt23, LatLng.CREATOR);
                    } else if (c34 == 5) {
                        latLng12 = (LatLng) bf.b.E(parcel, readInt23, LatLng.CREATOR);
                    } else if (c34 != 6) {
                        bf.b.p0(parcel, readInt23);
                    } else {
                        latLngBounds2 = (LatLngBounds) bf.b.E(parcel, readInt23, LatLngBounds.CREATOR);
                    }
                }
                bf.b.L(parcel, r025);
                return new VisibleRegion(latLng9, latLng10, latLng11, latLng12, latLngBounds2);
            case 23:
                int r026 = bf.b.r0(parcel);
                byte b13 = -1;
                byte b14 = -1;
                CameraPosition cameraPosition = null;
                byte b15 = -1;
                byte b16 = -1;
                byte b17 = -1;
                byte b18 = -1;
                byte b19 = -1;
                int i36 = 0;
                byte b23 = -1;
                byte b24 = -1;
                byte b25 = -1;
                byte b26 = -1;
                byte b27 = -1;
                Float f58 = null;
                Float f59 = null;
                LatLngBounds latLngBounds3 = null;
                while (parcel.dataPosition() < r026) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 2:
                            b13 = bf.b.b0(parcel, readInt24);
                            break;
                        case 3:
                            b14 = bf.b.b0(parcel, readInt24);
                            break;
                        case 4:
                            i36 = bf.b.h0(parcel, readInt24);
                            break;
                        case 5:
                            cameraPosition = (CameraPosition) bf.b.E(parcel, readInt24, CameraPosition.CREATOR);
                            break;
                        case 6:
                            b15 = bf.b.b0(parcel, readInt24);
                            break;
                        case 7:
                            b16 = bf.b.b0(parcel, readInt24);
                            break;
                        case '\b':
                            b17 = bf.b.b0(parcel, readInt24);
                            break;
                        case '\t':
                            b18 = bf.b.b0(parcel, readInt24);
                            break;
                        case '\n':
                            b19 = bf.b.b0(parcel, readInt24);
                            break;
                        case 11:
                            b23 = bf.b.b0(parcel, readInt24);
                            break;
                        case '\f':
                            b24 = bf.b.b0(parcel, readInt24);
                            break;
                        case '\r':
                        default:
                            bf.b.p0(parcel, readInt24);
                            break;
                        case 14:
                            b25 = bf.b.b0(parcel, readInt24);
                            break;
                        case 15:
                            b26 = bf.b.b0(parcel, readInt24);
                            break;
                        case 16:
                            f58 = bf.b.f0(parcel, readInt24);
                            break;
                        case 17:
                            f59 = bf.b.f0(parcel, readInt24);
                            break;
                        case 18:
                            latLngBounds3 = (LatLngBounds) bf.b.E(parcel, readInt24, LatLngBounds.CREATOR);
                            break;
                        case 19:
                            b27 = bf.b.b0(parcel, readInt24);
                            break;
                    }
                }
                bf.b.L(parcel, r026);
                GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                googleMapOptions.f31886h = -1;
                googleMapOptions.f31897s = null;
                googleMapOptions.f31898t = null;
                googleMapOptions.f31899u = null;
                googleMapOptions.f31884f = ig1.b.r1(b13);
                googleMapOptions.f31885g = ig1.b.r1(b14);
                googleMapOptions.f31886h = i36;
                googleMapOptions.f31887i = cameraPosition;
                googleMapOptions.f31888j = ig1.b.r1(b15);
                googleMapOptions.f31889k = ig1.b.r1(b16);
                googleMapOptions.f31890l = ig1.b.r1(b17);
                googleMapOptions.f31891m = ig1.b.r1(b18);
                googleMapOptions.f31892n = ig1.b.r1(b19);
                googleMapOptions.f31893o = ig1.b.r1(b23);
                googleMapOptions.f31894p = ig1.b.r1(b24);
                googleMapOptions.f31895q = ig1.b.r1(b25);
                googleMapOptions.f31896r = ig1.b.r1(b26);
                googleMapOptions.f31897s = f58;
                googleMapOptions.f31898t = f59;
                googleMapOptions.f31899u = latLngBounds3;
                googleMapOptions.f31900v = ig1.b.r1(b27);
                return googleMapOptions;
            case 24:
                int r027 = bf.b.r0(parcel);
                StreetViewPanoramaCamera streetViewPanoramaCamera = null;
                String str9 = null;
                LatLng latLng13 = null;
                Integer num = null;
                StreetViewSource streetViewSource = null;
                byte b28 = 0;
                byte b29 = 0;
                byte b33 = 0;
                byte b34 = 0;
                byte b35 = 0;
                while (parcel.dataPosition() < r027) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 2:
                            streetViewPanoramaCamera = (StreetViewPanoramaCamera) bf.b.E(parcel, readInt25, StreetViewPanoramaCamera.CREATOR);
                            break;
                        case 3:
                            str9 = bf.b.F(parcel, readInt25);
                            break;
                        case 4:
                            latLng13 = (LatLng) bf.b.E(parcel, readInt25, LatLng.CREATOR);
                            break;
                        case 5:
                            num = bf.b.i0(parcel, readInt25);
                            break;
                        case 6:
                            b35 = bf.b.b0(parcel, readInt25);
                            break;
                        case 7:
                            b28 = bf.b.b0(parcel, readInt25);
                            break;
                        case '\b':
                            b29 = bf.b.b0(parcel, readInt25);
                            break;
                        case '\t':
                            b33 = bf.b.b0(parcel, readInt25);
                            break;
                        case '\n':
                            b34 = bf.b.b0(parcel, readInt25);
                            break;
                        case 11:
                            streetViewSource = (StreetViewSource) bf.b.E(parcel, readInt25, StreetViewSource.CREATOR);
                            break;
                        default:
                            bf.b.p0(parcel, readInt25);
                            break;
                    }
                }
                bf.b.L(parcel, r027);
                StreetViewPanoramaOptions streetViewPanoramaOptions = new StreetViewPanoramaOptions();
                Boolean bool = Boolean.TRUE;
                streetViewPanoramaOptions.f31905j = bool;
                streetViewPanoramaOptions.f31906k = bool;
                streetViewPanoramaOptions.f31907l = bool;
                streetViewPanoramaOptions.f31908m = bool;
                streetViewPanoramaOptions.f31910o = StreetViewSource.f31995g;
                streetViewPanoramaOptions.f31901f = streetViewPanoramaCamera;
                streetViewPanoramaOptions.f31903h = latLng13;
                streetViewPanoramaOptions.f31904i = num;
                streetViewPanoramaOptions.f31902g = str9;
                streetViewPanoramaOptions.f31905j = ig1.b.r1(b35);
                streetViewPanoramaOptions.f31906k = ig1.b.r1(b28);
                streetViewPanoramaOptions.f31907l = ig1.b.r1(b29);
                streetViewPanoramaOptions.f31908m = ig1.b.r1(b33);
                streetViewPanoramaOptions.f31909n = ig1.b.r1(b34);
                streetViewPanoramaOptions.f31910o = streetViewSource;
                return streetViewPanoramaOptions;
            case 25:
                int r028 = bf.b.r0(parcel);
                long j16 = 0;
                long j17 = 0;
                long j18 = 0;
                String str10 = null;
                String str11 = null;
                zznc zzncVar = null;
                boolean z35 = false;
                String str12 = null;
                zzbg zzbgVar = null;
                zzbg zzbgVar2 = null;
                zzbg zzbgVar3 = null;
                while (parcel.dataPosition() < r028) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 2:
                            str10 = bf.b.F(parcel, readInt26);
                            break;
                        case 3:
                            str11 = bf.b.F(parcel, readInt26);
                            break;
                        case 4:
                            zzncVar = (zznc) bf.b.E(parcel, readInt26, zznc.CREATOR);
                            break;
                        case 5:
                            j16 = bf.b.j0(parcel, readInt26);
                            break;
                        case 6:
                            z35 = bf.b.a0(parcel, readInt26);
                            break;
                        case 7:
                            str12 = bf.b.F(parcel, readInt26);
                            break;
                        case '\b':
                            zzbgVar = (zzbg) bf.b.E(parcel, readInt26, zzbg.CREATOR);
                            break;
                        case '\t':
                            j17 = bf.b.j0(parcel, readInt26);
                            break;
                        case '\n':
                            zzbgVar2 = (zzbg) bf.b.E(parcel, readInt26, zzbg.CREATOR);
                            break;
                        case 11:
                            j18 = bf.b.j0(parcel, readInt26);
                            break;
                        case '\f':
                            zzbgVar3 = (zzbg) bf.b.E(parcel, readInt26, zzbg.CREATOR);
                            break;
                        default:
                            bf.b.p0(parcel, readInt26);
                            break;
                    }
                }
                bf.b.L(parcel, r028);
                return new zzad(str10, str11, zzncVar, j16, z35, str12, zzbgVar, j17, zzbgVar2, j18, zzbgVar3);
            case 26:
                int r029 = bf.b.r0(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < r029) {
                    int readInt27 = parcel.readInt();
                    if (((char) readInt27) != 1) {
                        bf.b.p0(parcel, readInt27);
                    } else {
                        bundle = bf.b.B(parcel, readInt27);
                    }
                }
                bf.b.L(parcel, r029);
                return new zzam(bundle);
            case 27:
                int r030 = bf.b.r0(parcel);
                Bundle bundle2 = null;
                while (parcel.dataPosition() < r030) {
                    int readInt28 = parcel.readInt();
                    if (((char) readInt28) != 2) {
                        bf.b.p0(parcel, readInt28);
                    } else {
                        bundle2 = bf.b.B(parcel, readInt28);
                    }
                }
                bf.b.L(parcel, r030);
                return new zzbb(bundle2);
            case 28:
                int r031 = bf.b.r0(parcel);
                long j19 = 0;
                String str13 = null;
                zzbb zzbbVar = null;
                String str14 = null;
                while (parcel.dataPosition() < r031) {
                    int readInt29 = parcel.readInt();
                    char c35 = (char) readInt29;
                    if (c35 == 2) {
                        str13 = bf.b.F(parcel, readInt29);
                    } else if (c35 == 3) {
                        zzbbVar = (zzbb) bf.b.E(parcel, readInt29, zzbb.CREATOR);
                    } else if (c35 == 4) {
                        str14 = bf.b.F(parcel, readInt29);
                    } else if (c35 != 5) {
                        bf.b.p0(parcel, readInt29);
                    } else {
                        j19 = bf.b.j0(parcel, readInt29);
                    }
                }
                bf.b.L(parcel, r031);
                return new zzbg(str13, zzbbVar, str14, j19);
            default:
                int r032 = bf.b.r0(parcel);
                String str15 = null;
                int i37 = 0;
                while (parcel.dataPosition() < r032) {
                    int readInt30 = parcel.readInt();
                    char c36 = (char) readInt30;
                    if (c36 == 1) {
                        str15 = bf.b.F(parcel, readInt30);
                    } else if (c36 == 2) {
                        j13 = bf.b.j0(parcel, readInt30);
                    } else if (c36 != 3) {
                        bf.b.p0(parcel, readInt30);
                    } else {
                        i37 = bf.b.h0(parcel, readInt30);
                    }
                }
                bf.b.L(parcel, r032);
                return new zzmh(str15, j13, i37);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        switch (this.f83534a) {
            case 0:
                return new DetectedActivity[i13];
            case 1:
                return new zzj[i13];
            case 2:
                return new GeofencingRequest[i13];
            case 3:
                return new CameraPosition[i13];
            case 4:
                return new Cap[i13];
            case 5:
                return new CircleOptions[i13];
            case 6:
                return new GroundOverlayOptions[i13];
            case 7:
                return new LatLngBounds[i13];
            case 8:
                return new LatLng[i13];
            case 9:
                return new MapStyleOptions[i13];
            case 10:
                return new MarkerOptions[i13];
            case 11:
                return new PatternItem[i13];
            case 12:
                return new PointOfInterest[i13];
            case 13:
                return new PolygonOptions[i13];
            case 14:
                return new PolylineOptions[i13];
            case 15:
                return new StreetViewPanoramaCamera[i13];
            case 16:
                return new StreetViewPanoramaLink[i13];
            case 17:
                return new StreetViewPanoramaLocation[i13];
            case 18:
                return new StreetViewPanoramaOrientation[i13];
            case 19:
                return new StreetViewSource[i13];
            case 20:
                return new Tile[i13];
            case 21:
                return new TileOverlayOptions[i13];
            case 22:
                return new VisibleRegion[i13];
            case 23:
                return new GoogleMapOptions[i13];
            case 24:
                return new StreetViewPanoramaOptions[i13];
            case 25:
                return new zzad[i13];
            case 26:
                return new zzam[i13];
            case 27:
                return new zzbb[i13];
            case 28:
                return new zzbg[i13];
            default:
                return new zzmh[i13];
        }
    }
}
