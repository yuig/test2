package com.pinterest.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.LruCache;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xk;
import com.pinterest.api.model.zs;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.framework.screens.g;
import h32.d4;
import h32.i0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku1.e;
import ml1.b;
import nx.a;
import nx.o0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/navigation/NavigationImpl;", "Lcom/pinterest/navigation/Navigation;", "nl/b", "za/c", "navigation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NavigationImpl implements Navigation {

    /* renamed from: a */
    public final ScreenLocation f49939a;

    /* renamed from: b */
    public final String f49940b;

    /* renamed from: c */
    public final int f49941c;

    /* renamed from: d */
    public final Bundle f49942d;

    /* renamed from: e */
    public final HashMap f49943e;

    /* renamed from: f */
    public d4 f49944f;

    /* renamed from: g */
    public Navigation f49945g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavigationImpl(ScreenLocation location, String id3, int i13) {
        this(location, id3, i13, 8);
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(id3, "id");
    }

    @Override // com.pinterest.navigation.Navigation
    public final Parcelable A0() {
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_MAGIC_LINK", "key");
        Parcelable parcelable = this.f49942d.getParcelable("com.pinterest.EXTRA_MAGIC_LINK");
        if (parcelable == null) {
            return null;
        }
        return parcelable;
    }

    @Override // com.pinterest.navigation.Navigation
    public final ArrayList D0() {
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_REPORT_FLOW_SECONDARY_REASONS", "key");
        return this.f49942d.getParcelableArrayList("com.pinterest.EXTRA_REPORT_FLOW_SECONDARY_REASONS");
    }

    @Override // com.pinterest.navigation.Navigation
    public final float D1(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49942d.getFloat(key, -1.0f);
    }

    @Override // com.pinterest.navigation.Navigation
    public final void J0() {
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_BLOCK_AUTOLOGIN", "key");
        this.f49942d.remove("com.pinterest.EXTRA_BLOCK_AUTOLOGIN");
    }

    @Override // com.pinterest.navigation.Navigation
    public final int J1(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49942d.getInt(key, 0);
    }

    @Override // com.pinterest.navigation.Navigation
    public final ArrayList M(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49942d.getStringArrayList(key);
    }

    @Override // com.pinterest.navigation.Navigation
    /* renamed from: O, reason: from getter */
    public final Bundle getF49942d() {
        return this.f49942d;
    }

    @Override // com.pinterest.navigation.Navigation
    public final v7 P1() {
        Object i03 = i0("__cached_model");
        v7 v7Var = i03 instanceof v7 ? (v7) i03 : null;
        if (v7Var == null) {
            gw gwVar = fw.f37821a;
            String str = this.f49940b;
            gwVar.getClass();
            v7Var = gw.b(str);
            if (v7Var == null) {
                return null;
            }
            e(v7Var);
        }
        return v7Var;
    }

    @Override // com.pinterest.navigation.Navigation
    public final ArrayList Q1(String str) {
        return this.f49942d.getIntegerArrayList(str);
    }

    @Override // com.pinterest.navigation.Navigation
    public final boolean S(String key, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49942d.getBoolean(key, z13);
    }

    @Override // com.pinterest.navigation.Navigation
    public final long U(long j13) {
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_LOCAL_STORY_PIN_PAGE_DURATION", "key");
        return this.f49942d.getLong("com.pinterest.EXTRA_LOCAL_STORY_PIN_PAGE_DURATION", j13);
    }

    @Override // com.pinterest.navigation.Navigation
    public final float V0() {
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_VIDEO_SCREEN_RATIO", "key");
        return this.f49942d.getFloat("com.pinterest.EXTRA_VIDEO_SCREEN_RATIO", 0.0f);
    }

    @Override // com.pinterest.navigation.Navigation
    public final Object X0() {
        return i0("__cached_model");
    }

    @Override // com.pinterest.navigation.Navigation
    public final void Y1(String key, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f49942d.putBoolean(key, z13);
    }

    @Override // com.pinterest.navigation.Navigation
    public final Serializable Z0(String key, Serializable serializable) {
        Intrinsics.checkNotNullParameter(key, "key");
        Serializable serializable2 = this.f49942d.getSerializable(key);
        return serializable2 == null ? serializable : serializable2;
    }

    public final void a(ArrayList value) {
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_PINNABLE_IMAGE", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f49942d.putParcelableArrayList("com.pinterest.EXTRA_PINNABLE_IMAGE", value);
    }

    @Override // com.pinterest.navigation.Navigation
    /* renamed from: a0, reason: from getter */
    public final d4 getF49944f() {
        return this.f49944f;
    }

    public final void b(String key, Serializable value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f49942d.putSerializable(key, value);
    }

    @Override // com.pinterest.navigation.Navigation
    public final ScreenModel b1() {
        int i13;
        int value;
        Bundle bundle = new Bundle();
        bundle.putParcelable("NAVIGATION_MODEL_BUNDLE_KEY", this);
        bundle.putString("NAVIGATION_UUID_KEY", UUID.randomUUID().toString());
        Navigation navigation = this.f49945g;
        if (navigation != null) {
            bundle.putParcelable("SCREEN_BUNDLE_EXTRA_KEY", navigation.b1());
        }
        ScreenLocation screenLocation = this.f49939a;
        bundle.putBoolean("SHOULD_KEEP_LAST_SCREEN_VISIBLE_KEY", screenLocation.getF48309b());
        bundle.putBoolean("SHOULD_NOT_ACTIVATE_LAST_SCREEN_VISIBLE_KEY", screenLocation.getF47614c());
        g f47611b = screenLocation.getF47611b();
        if (!screenLocation.getF47609b()) {
            int value2 = b.UNSPECIFIED_TRANSITION.getValue();
            i13 = this.f49941c;
            if (i13 == value2) {
                value = e.f80898a[f47611b.ordinal()] == 1 ? b.MODAL_TRANSITION.getValue() : b.DEFAULT_TRANSITION.getValue();
            }
            ScreenModel screenModel = new ScreenModel(screenLocation, i13, bundle, null, null, 56);
            screenLocation.onScreenNavigation();
            screenModel.f49211g = screenLocation.getF49203a();
            return screenModel;
        }
        value = b.NO_TRANSITION.getValue();
        i13 = value;
        ScreenModel screenModel2 = new ScreenModel(screenLocation, i13, bundle, null, null, 56);
        screenLocation.onScreenNavigation();
        screenModel2.f49211g = screenLocation.getF49203a();
        return screenModel2;
    }

    @Override // com.pinterest.navigation.Navigation
    public final Parcelable b2(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49942d.getParcelable(key);
    }

    public final void d(String key, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f49942d.putStringArrayList(key, arrayList);
    }

    @Override // com.pinterest.navigation.Navigation
    public final void d0(long j13, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f49942d.putLong(key, j13);
    }

    @Override // com.pinterest.navigation.Navigation
    public final ArrayList d2() {
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_PINNABLE_IMAGE", "key");
        return this.f49942d.getParcelableArrayList("com.pinterest.EXTRA_PINNABLE_IMAGE");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f49943e.put("__cached_model", model);
        if (model instanceof f30) {
            ew.l((f30) model);
            return;
        }
        if (model instanceof v7) {
            ew.g((v7) model);
            return;
        }
        if (model instanceof wy0) {
            ew.n((wy0) model);
            return;
        }
        if (model instanceof zs) {
            ew.j((zs) model);
            return;
        }
        if (!(model instanceof az0)) {
            if (model instanceof xk) {
                ew.i((xk) model);
                return;
            }
            return;
        }
        az0 az0Var = (az0) model;
        if (az0Var == null) {
            LruCache lruCache = ew.f37357a;
            return;
        }
        LruCache lruCache2 = ew.f37363g;
        synchronized (lruCache2) {
            lruCache2.put(az0Var.getId(), az0Var);
        }
    }

    @Override // com.pinterest.navigation.Navigation
    public final String e1() {
        StringBuilder sb3 = new StringBuilder("location:");
        sb3.append(this.f49939a.getName());
        sb3.append(" ID:");
        sb3.append(this.f49940b);
        sb3.append(" Model:");
        Object i03 = i0("__cached_model");
        sb3.append(i03 != null ? i03.getClass().getSimpleName() : null);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(NavigationImpl.class, obj.getClass())) {
            return false;
        }
        Navigation navigation = (Navigation) obj;
        if (this.f49939a != navigation.getF49939a()) {
            return false;
        }
        return Intrinsics.d(this.f49940b, navigation.getF49940b());
    }

    @Override // com.pinterest.navigation.Navigation
    /* renamed from: f2, reason: from getter */
    public final ScreenLocation getF49939a() {
        return this.f49939a;
    }

    @Override // com.pinterest.navigation.Navigation
    public final String g2(String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        String string = this.f49942d.getString(key, defaultValue);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.pinterest.navigation.Navigation
    public final g getDisplayMode() {
        return this.f49939a.getF47611b();
    }

    @Override // com.pinterest.navigation.Navigation
    /* renamed from: getId, reason: from getter */
    public final String getF49940b() {
        return this.f49940b;
    }

    public final int hashCode() {
        return this.f49940b.hashCode() + (this.f49939a.hashCode() * 31);
    }

    @Override // com.pinterest.navigation.Navigation
    public final Object i0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49943e.get(key);
    }

    @Override // com.pinterest.navigation.Navigation
    public final void m0(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f49942d.putString(key, str);
    }

    @Override // com.pinterest.navigation.Navigation
    public final int q1(int i13, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49942d.getInt(key, i13);
    }

    @Override // com.pinterest.navigation.Navigation
    public final boolean r1() {
        return this.f49939a.getF48309b();
    }

    public final String toString() {
        return this.f49939a + ":" + this.f49940b;
    }

    @Override // com.pinterest.navigation.Navigation
    public final String v0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49942d.getString(key);
    }

    @Override // com.pinterest.navigation.Navigation
    public final boolean w(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49942d.containsKey(key);
    }

    @Override // com.pinterest.navigation.Navigation
    public final void w0(Parcelable parcelable, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f49942d.putParcelable(key, parcelable);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f49939a, i13);
        dest.writeString(this.f49940b);
        dest.writeBundle(this.f49942d);
        d4 d4Var = this.f49944f;
        dest.writeInt(d4Var != null ? d4Var.getValue() : 0);
        dest.writeParcelable(this.f49945g, i13);
        dest.writeInt(this.f49941c);
        Bundle bundle = new Bundle();
        Object obj = this.f49943e.get("com.pinterest.EXTRA_FEED");
        PinFeed pinFeed = obj instanceof PinFeed ? (PinFeed) obj : null;
        if (pinFeed != null) {
            pinFeed.G(bundle);
            bundle.putParcelable("NAVGIATION_EXTRA_FEED_BUNDLE_KEY", pinFeed);
        }
        dest.writeBundle(bundle);
    }

    @Override // com.pinterest.navigation.Navigation
    public final long x0() {
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_BOARD_COLLABORATOR_MODAL_DELAY_MS", "key");
        return this.f49942d.getLong("com.pinterest.EXTRA_BOARD_COLLABORATOR_MODAL_DELAY_MS", 0L);
    }

    @Override // com.pinterest.navigation.Navigation
    public final void y0(Object obj, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        HashMap hashMap = this.f49943e;
        if (obj != null) {
            hashMap.put(key, obj);
        } else {
            hashMap.remove(key);
        }
    }

    @Override // com.pinterest.navigation.Navigation
    public final void z(int i13, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f49942d.putInt(key, i13);
    }

    public NavigationImpl(ScreenLocation location, String id3, int i13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f49939a = location;
        this.f49940b = id3;
        this.f49941c = i13;
        this.f49942d = bundle;
        this.f49943e = new HashMap();
        a d2 = o0.f92437i.d();
        i0 generateLoggingContext = d2 != null ? d2.generateLoggingContext() : null;
        this.f49944f = generateLoggingContext != null ? generateLoggingContext.f67081a : null;
    }

    public /* synthetic */ NavigationImpl(ScreenLocation screenLocation, String str, int i13, int i14) {
        this(screenLocation, str, (i14 & 4) != 0 ? b.UNSPECIFIED_TRANSITION.getValue() : i13, new Bundle());
    }
}
