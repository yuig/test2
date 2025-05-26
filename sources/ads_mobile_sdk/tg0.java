package ads_mobile_sdk;

import a.p0;
import android.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nm.s;

/* loaded from: classes2.dex */
public abstract class tg0 {

    /* renamed from: a, reason: collision with root package name */
    public final eg0 f11535a;

    /* renamed from: b, reason: collision with root package name */
    public final fe2 f11536b;

    /* renamed from: c, reason: collision with root package name */
    public final jf f11537c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f11538d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f11539e;

    /* renamed from: f, reason: collision with root package name */
    public nm.u f11540f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f11541g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f11542h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f11543i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f11544j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f11545k;

    public tg0(eg0 flagDataStore, fe2 sdkCoreDataStore, jf appSettingsDataStore) {
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        Intrinsics.checkNotNullParameter(sdkCoreDataStore, "sdkCoreDataStore");
        Intrinsics.checkNotNullParameter(appSettingsDataStore, "appSettingsDataStore");
        this.f11535a = flagDataStore;
        this.f11536b = sdkCoreDataStore;
        this.f11537c = appSettingsDataStore;
        this.f11538d = new AtomicBoolean(false);
        this.f11539e = new AtomicBoolean(false);
        p0 builder = ds.y();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f11541g = new AtomicReference(new fs(builder).a());
        a.oe builder2 = wv1.u();
        Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder2, "builder");
        this.f11542h = new AtomicReference(new yv1(builder2).a());
        a.ec builder3 = tx1.u();
        Intrinsics.checkNotNullExpressionValue(builder3, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder3, "builder");
        this.f11543i = new AtomicReference(new vx1(builder3).a());
        this.f11544j = new AtomicReference(kotlin.collections.z0.d());
        this.f11545k = new AtomicBoolean(false);
    }

    public final Object a(String key, Function1 converter) {
        a.j3 j3Var;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(converter, "converter");
        if (!this.f11538d.get()) {
            Intrinsics.checkNotNullParameter("Flags have not been initialized!", "message");
            gk0.c("Flags have not been initialized!", null);
            IllegalStateException illegalStateException = new IllegalStateException("Flags have not been initialized!");
            illegalStateException.printStackTrace();
            xk xkVar = wk.f13103a;
            if (xkVar == xk.f13701b) {
                throw illegalStateException;
            }
            if (xkVar == xk.f13702c) {
                throw illegalStateException;
            }
            if (xkVar == xk.f13700a && (j3Var = ds2.f4430a) != null) {
                ((ks2) j3Var).a("Flags have not been initialized!", illegalStateException);
            }
        }
        return b(key, converter);
    }

    public final Object b(String key, Function1 converter) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(converter, "converter");
        try {
            nm.u uVar = this.f11540f;
            if (uVar == null) {
                Intrinsics.r("flagJson");
                throw null;
            }
            s v13 = uVar.v(key);
            Intrinsics.checkNotNullExpressionValue(v13, "get(...)");
            return converter.invoke(v13);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a() {
        ds dsVar = (ds) this.f11541g.get();
        if (dsVar.w().s() > 0 && dsVar.x().s() > 0) {
            Intrinsics.checkNotNullExpressionValue(dsVar.r(), "getConcatenatedSignalsMapMap(...)");
            if (!r1.isEmpty()) {
                this.f11542h.set(dsVar.w());
                this.f11543i.set(dsVar.x());
                this.f11544j.set(dsVar.r());
                this.f11545k.set(true);
                return;
            }
        }
        String str = (String) b("test_pattern_matching_flag", rg0.f10609a);
        if (str == null) {
            str = "";
        }
        String str2 = (String) b("test_preprocessing_flag", sg0.f11086a);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) b("test_concatenated_signals_flag", qg0.f10070a);
        String str4 = str3 != null ? str3 : "";
        if ((!z.j(str)) && (!z.j(str2)) && (!z.j(str4))) {
            this.f11542h.set(wv1.a(Base64.decode(str, 0)));
            this.f11543i.set(tx1.a(Base64.decode(str2, 0)));
            AtomicReference atomicReference = this.f11544j;
            pm.o oVar = ((nm.u) new nm.o().b(nm.u.class, str4)).f91366a;
            Intrinsics.checkNotNullExpressionValue(oVar, "asMap(...)");
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.y0.a(oVar.f100619d));
            for (Map.Entry entry : oVar.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((s) entry.getValue()).j().p());
            }
            atomicReference.set(linkedHashMap);
            this.f11545k.set(true);
        }
    }
}
