package com.pinterest.feature.search.visual.cropper;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import yk1.p;
import yk1.r;

/* loaded from: classes5.dex */
public final class l extends p implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f48032a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48033b;

    /* renamed from: c, reason: collision with root package name */
    public float f48034c;

    /* renamed from: d, reason: collision with root package name */
    public final float f48035d;

    /* renamed from: e, reason: collision with root package name */
    public float f48036e;

    /* renamed from: f, reason: collision with root package name */
    public float f48037f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f48038g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f48039h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i13, int i14, float f13, uk1.d pinalytics, q networkStateStream) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f48032a = i13;
        this.f48033b = i14;
        this.f48034c = f13;
        this.f48035d = 1.0f;
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        j view = (j) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        j view = (j) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((h) view).f48031z = this;
    }

    public final void p3(float f13, float f14, float f15, float f16, boolean z13, boolean z14, boolean z15, boolean z16) {
        i iVar;
        if (!z15 && !z13 && !this.f48038g) {
            ((h) ((j) getView())).D(f13, f14);
        }
        if (this.f48034c > this.f48035d) {
            if ((z13 || (this.f48038g && z14)) && z16) {
                m mVar = (m) ((h) ((j) getView())).f48029x;
                mVar.getClass();
                float f17 = f13 == 0.0f ? 0.0f : 1.0f;
                float f18 = f14 != 0.0f ? 1.0f : 0.0f;
                f91.b bVar = mVar.f48040y;
                float f19 = bVar.f61461l0 - bVar.f61459j0;
                float f23 = mVar.C;
                float z17 = ((f19 - (f17 * f23)) * (bVar.z() - (f18 * f23))) / (bVar.z() * (bVar.f61461l0 - bVar.f61459j0));
                FlashlightCropperView flashlightCropperView = mVar.f47997h;
                h hVar = flashlightCropperView instanceof h ? (h) flashlightCropperView : null;
                if (hVar != null) {
                    float width = hVar.f47965m.width() * z17;
                    RectF rectF = hVar.f47966n;
                    if ((width <= rectF.width() || hVar.f47965m.height() * z17 <= rectF.height()) && (iVar = hVar.f48031z) != null) {
                        ((l) iVar).f48039h = true;
                    }
                }
                o80.j jVar = bVar.f61465p0;
                if (jVar != null) {
                    jVar.k(z17, f15, f16);
                }
                this.f48038g = true;
            }
        }
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        j view = (j) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((h) view).f48031z = this;
    }
}
