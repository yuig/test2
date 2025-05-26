package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s40 implements fl1.e {
    @Override // fl1.e
    public final dl1.s a(dl1.s sVar, dl1.s sVar2) {
        f30 a13;
        dl0 a14;
        f30 oldModel = (f30) sVar;
        f30 newModel = (f30) sVar2;
        Intrinsics.checkNotNullParameter(oldModel, "oldModel");
        Intrinsics.checkNotNullParameter(newModel, "newModel");
        if (oldModel == newModel) {
            oldModel.getClass();
            a13 = oldModel;
        } else {
            e30 R6 = oldModel.R6();
            R6.b(newModel);
            a13 = R6.a();
        }
        e30 R62 = a13.R6();
        Intrinsics.checkNotNullExpressionValue(R62, "toBuilder(...)");
        f3 z33 = oldModel.z3();
        f3 z34 = newModel.z3();
        if (z33 != null && z34 != null && Intrinsics.d(z33.getUid(), z34.getUid())) {
            if (z33 != z34) {
                i3 P = z33.P();
                P.b(z34);
                z33 = P.a();
            }
            R62.h(z33);
        }
        v7 D3 = oldModel.D3();
        v7 D32 = newModel.D3();
        if (D3 != null && D32 != null && bs1.c.g1(D3, D32)) {
            R62.l(D3.F1(D32));
        }
        if (Intrinsics.d(oldModel.w6(), newModel.w6())) {
            dl0 v63 = oldModel.v6();
            dl0 v64 = newModel.v6();
            if (v63 != null && v64 != null) {
                if (v63 == v64) {
                    a14 = v63;
                } else {
                    al0 w13 = v63.w();
                    w13.b(v64);
                    a14 = w13.a();
                }
                al0 w14 = a14.w();
                jo0 q13 = v63.q();
                jo0 q14 = v64.q();
                if (q13 != null && q14 != null) {
                    if (q13 != q14) {
                        go0 t13 = q13.t();
                        t13.b(q14);
                        q13 = t13.a();
                    }
                    w14.f(q13);
                }
                dl0 a15 = w14.a();
                Intrinsics.checkNotNullExpressionValue(a15, "build(...)");
                R62.m2(a15);
            }
        }
        hh t53 = oldModel.t5();
        hh hhVar = null;
        wy0 d2 = t53 != null ? t53.d() : null;
        hh t54 = newModel.t5();
        wy0 d13 = t54 != null ? t54.d() : null;
        if (d2 != null && d13 != null && Intrinsics.d(d2.getUid(), d13.getUid())) {
            hh t55 = newModel.t5();
            if (t55 != null) {
                eh e13 = t55.e();
                e13.c(d2.G4(d13));
                hhVar = e13.a();
            }
            R62.o1(hhVar);
        }
        f30 a16 = R62.a();
        Intrinsics.checkNotNullExpressionValue(a16, "build(...)");
        return a16;
    }
}
