package com.pinterest.feature.pincarouselads.view;

import android.graphics.Bitmap;
import android.os.SystemClock;
import lb.l0;
import q8.c0;

/* loaded from: classes2.dex */
public final class k extends l0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f47384c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f47385d;

    public k(Object obj, int i13) {
        this.f47384c = i13;
        this.f47385d = obj;
    }

    @Override // lb.l0
    public final void O0() {
        switch (this.f47384c) {
            case 1:
                yi1.s sVar = (yi1.s) this.f47385d;
                int i13 = yi1.s.f139152l;
                sVar.getClass();
                sVar.f139155h.a(new yi1.w());
                break;
        }
    }

    @Override // lb.l0
    public final void P0(Bitmap bitmap, hs1.x xVar) {
        l21.h hVar;
        int i13 = this.f47384c;
        Object obj = this.f47385d;
        switch (i13) {
            case 0:
                l lVar = (l) obj;
                l21.g gVar = lVar.f47394h;
                if (gVar != null) {
                    gVar.U();
                }
                if (lVar.f47409w == 0 && (hVar = lVar.f47395i) != null) {
                    hVar.F1();
                    break;
                }
                break;
            default:
                if (xVar != null) {
                    yi1.s sVar = (yi1.s) obj;
                    sVar.f139157j = true;
                    sVar.f139155h.a(new yi1.x(xVar, new c0(1), SystemClock.elapsedRealtime(), System.currentTimeMillis()));
                    sVar.f139158k.j();
                    break;
                }
                break;
        }
    }
}
