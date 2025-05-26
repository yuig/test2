package com.pinterest.feature.pin;

import a.z0;
import com.pinterest.api.model.f30;
import df.j1;
import i32.y0;
import jk2.d1;
import jk2.h0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.b0;
import t3.s1;
import uj2.a0;
import x02.c2;
import x02.i2;
import x02.x0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final zf0.f f47227a;

    /* renamed from: b, reason: collision with root package name */
    public final rg0.s f47228b;

    /* renamed from: c, reason: collision with root package name */
    public final ug0.i f47229c;

    /* renamed from: d, reason: collision with root package name */
    public final w f47230d;

    /* renamed from: e, reason: collision with root package name */
    public final i2 f47231e;

    /* renamed from: f, reason: collision with root package name */
    public final x0 f47232f;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f47233g;

    public j(zf0.f educationHelper, rg0.s experiences, ug0.i experiencesApi, w eventManager, i2 pinRepository, x0 boardRepository, b0 pinAuxHelper) {
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(experiencesApi, "experiencesApi");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f47227a = educationHelper;
        this.f47228b = experiences;
        this.f47229c = experiencesApi;
        this.f47230d = eventManager;
        this.f47231e = pinRepository;
        this.f47232f = boardRepository;
        this.f47233g = pinAuxHelper;
    }

    public final xj2.c a(f30 pin, c2 params, ak2.e onRepinSuccess, ak2.e onRepinFailure) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(onRepinSuccess, "onRepinSuccess");
        Intrinsics.checkNotNullParameter(onRepinFailure, "onRepinFailure");
        xj2.c o13 = c0.d.B2(this.f47231e, params, this.f47233g).o(new i(0, new aw0.j(this, onRepinSuccess, pin, params, 4)), onRepinFailure);
        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
        zf0.f fVar = this.f47227a;
        fVar.getClass();
        y0 y0Var = y0.ANDROID_PIN_CLOSEUP_TAKEOVER;
        if (j1.D0(y0Var, i32.l.ANDROID_PINIT_BTN_TOOLTIP)) {
            rg0.n b13 = ((dh0.d) this.f47228b).b(y0Var);
            if (b13 != null) {
                String pid = b13.f108063e;
                Intrinsics.checkNotNullExpressionValue(pid, "pid");
                d1 d1Var = new d1(ug0.i.d(this.f47229c, pid, String.valueOf(b13.f108060b), null, new tg0.c(false, false), 20).C(h0.f76488a));
                fk2.g gVar = new fk2.g(new z0(this, 6), 0);
                a0 a0Var = tk2.e.f118017c;
                nl.b.s(s1.f(new ik2.b(0, d1Var.b(gVar.l(a0Var)), this.f47229c.g(new tg0.c(false, false)).H(a0Var)).H(a0Var), "observeOn(...)"), new ky0.b(6, this, pin), null, null, 6);
            }
        } else if (zf0.f.i()) {
            fVar.l(y0Var, i32.l.ANDROID_SAVE_EDUCATION);
        }
        return o13;
    }
}
