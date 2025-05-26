package ua0;

import ao2.j0;
import i92.k;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import ta0.i;
import ta0.j;
import ta0.l;
import u50.r;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final k f121407a;

    public e(k toastUtils) {
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f121407a = toastUtils;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        l request = (l) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof i;
        k kVar = this.f121407a;
        if (z13) {
            i iVar = (i) request;
            kVar.c(new ta0.h(iVar.f116884a, iVar.f116885b));
        } else if (request instanceof ta0.k) {
            kVar.m(((ta0.k) request).f116888a);
        } else if (request instanceof j) {
            kVar.k(((j) request).f116887a);
        }
    }
}
