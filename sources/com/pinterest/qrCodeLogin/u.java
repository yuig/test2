package com.pinterest.qrCodeLogin;

import h32.u0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final u f50337j = new u(0);

    /* renamed from: k, reason: collision with root package name */
    public static final u f50338k = new u(1);

    /* renamed from: l, reason: collision with root package name */
    public static final u f50339l = new u(2);

    /* renamed from: m, reason: collision with root package name */
    public static final u f50340m = new u(3);

    /* renamed from: n, reason: collision with root package name */
    public static final u f50341n = new u(4);

    /* renamed from: o, reason: collision with root package name */
    public static final u f50342o = new u(5);

    /* renamed from: p, reason: collision with root package name */
    public static final u f50343p = new u(6);

    /* renamed from: q, reason: collision with root package name */
    public static final u f50344q = new u(7);

    /* renamed from: r, reason: collision with root package name */
    public static final u f50345r = new u(8);

    /* renamed from: s, reason: collision with root package name */
    public static final u f50346s = new u(9);

    /* renamed from: t, reason: collision with root package name */
    public static final u f50347t = new u(10);

    /* renamed from: u, reason: collision with root package name */
    public static final u f50348u = new u(11);

    /* renamed from: v, reason: collision with root package name */
    public static final u f50349v = new u(12);

    /* renamed from: w, reason: collision with root package name */
    public static final u f50350w = new u(13);

    /* renamed from: x, reason: collision with root package name */
    public static final u f50351x = new u(14);

    /* renamed from: y, reason: collision with root package name */
    public static final u f50352y = new u(15);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f50353i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13) {
        super(1);
        this.f50353i = i13;
    }

    public final j b(j it) {
        switch (this.f50353i) {
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                ln1.e eVar = ln1.e.LOADED;
                e eVar2 = e.f50305g;
                it.getClass();
                return j.e(eVar, eVar2);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return j.e(ln1.e.LOADED, it.f50320b);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                ln1.e eVar3 = ln1.e.LOADED;
                f fVar = f.f50307g;
                it.getClass();
                return j.e(eVar3, fVar);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                ln1.e eVar4 = ln1.e.LOADED;
                c cVar = c.f50301g;
                it.getClass();
                return j.e(eVar4, cVar);
        }
    }

    public final void e(h32.h0 update) {
        switch (this.f50353i) {
            case 5:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0.QR_CODE_CONFIRM_BUTTON;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0.QR_CODE_CONFIRMATION_TOAST;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = h32.g0.QR_CODE_VERIFICATION_ERROR_MODAL;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = h32.g0.QR_CODE_VERIFICATION_ERROR_MODAL;
                update.f67047f = u0.QR_CODE_ERROR_OK_BUTTON;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = h32.g0.QR_CODE_VERIFICATION_ERROR_MODAL;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0.QR_CODE_REJECT_BUTTON;
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = h32.g0.QR_CODE_CONFIRMATION_MODAL;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u uVar = f50338k;
        u uVar2 = f50340m;
        int i13 = this.f50353i;
        switch (i13) {
            case 0:
                kn1.b it = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                rm1.l standard = (rm1.l) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(standard, "$this$standard");
                        standard.b(rm1.i.XXL);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(standard, "$this$standard");
                        standard.b(rm1.i.XXL);
                        break;
                }
                break;
            case 2:
                rm1.k bind = (rm1.k) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.b(uVar);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.b(uVar2);
                        break;
                }
                break;
            case 3:
                rm1.l standard2 = (rm1.l) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(standard2, "$this$standard");
                        standard2.b(rm1.i.XXL);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(standard2, "$this$standard");
                        standard2.b(rm1.i.XXL);
                        break;
                }
                break;
            case 4:
                rm1.k bind2 = (rm1.k) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.b(uVar);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.b(uVar2);
                        break;
                }
                break;
            case 5:
                e((h32.h0) obj);
                break;
            case 6:
                e((h32.h0) obj);
                break;
            case 7:
                e((h32.h0) obj);
                break;
            case 8:
                e((h32.h0) obj);
                break;
            case 9:
                e((h32.h0) obj);
                break;
            case 10:
                e((h32.h0) obj);
                break;
            case 11:
                e((h32.h0) obj);
                break;
        }
        return b((j) obj);
    }
}
