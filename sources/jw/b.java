package jw;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import lh0.i;
import lh0.z0;
import xk2.m;
import xk2.v;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final Regex f77647g = new Regex("_([a-zA-z]+)(_\\d+)+");

    /* renamed from: a, reason: collision with root package name */
    public final i f77648a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f77649b;

    /* renamed from: c, reason: collision with root package name */
    public final zr.b f77650c;

    /* renamed from: d, reason: collision with root package name */
    public final iz1.a f77651d;

    /* renamed from: e, reason: collision with root package name */
    public final v f77652e;

    /* renamed from: f, reason: collision with root package name */
    public final v f77653f;

    public b(i experiments, z0 experimentsActivator, zr.b adsSystemUtils, iz1.a powerScoreManager) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        Intrinsics.checkNotNullParameter(adsSystemUtils, "adsSystemUtils");
        Intrinsics.checkNotNullParameter(powerScoreManager, "powerScoreManager");
        this.f77648a = experiments;
        this.f77649b = experimentsActivator;
        this.f77650c = adsSystemUtils;
        this.f77651d = powerScoreManager;
        this.f77652e = m.b(new a(this, 1));
        this.f77653f = m.b(new a(this, 0));
    }

    public final double a() {
        return ((Number) this.f77653f.getValue()).doubleValue();
    }

    public final c b() {
        return (c) this.f77652e.getValue();
    }

    public final boolean c() {
        Integer f13;
        c b13 = b();
        if (b13 == null || (f13 = b13.f()) == null) {
            return true;
        }
        return a() <= ((double) f13.intValue());
    }

    public final boolean d() {
        Integer e13;
        c b13 = b();
        if (b13 == null || (e13 = b13.e()) == null) {
            return false;
        }
        return a() <= ((double) e13.intValue());
    }
}
