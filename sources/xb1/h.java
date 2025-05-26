package xb1;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import nm.q;
import nm.u;
import nm.v;
import wb1.l0;
import yq0.m;
import yq0.t;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134517i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f134518j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i13) {
        super(1);
        this.f134517i = i13;
        this.f134518j = jVar;
    }

    public final void b(Throwable it) {
        int i13 = this.f134517i;
        j jVar = this.f134518j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                jVar.f134529e.k(x0.responses_create_failure);
                break;
            case 2:
            default:
                jVar.f134529e.k(x0.responses_create_failure);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                jVar.f134529e.k(x0.responses_create_failure);
                break;
        }
    }

    public final void e(u it) {
        int i13 = this.f134517i;
        j jVar = this.f134518j;
        int i14 = 0;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                q w13 = it.w("comments_phrase_filter_list");
                int size = w13.f91364a.size();
                String[] strArr = new String[size];
                for (int i15 = 0; i15 < size; i15++) {
                    String p13 = w13.u(i15).p();
                    if (p13 == null) {
                        p13 = "";
                    }
                    strArr[i15] = p13;
                }
                List b03 = c0.b0(strArr);
                jVar.f134529e.k(g52.c.settings_menu_comments_manual_filter_saved);
                for (Object obj : CollectionsKt.F0(jVar.f134531g.f135191h)) {
                    int i16 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    dl1.s sVar = (dl1.s) obj;
                    if (sVar instanceof wb1.c0) {
                        wb1.c0 c0Var = (wb1.c0) sVar;
                        c0Var.getClass();
                        Intrinsics.checkNotNullParameter(b03, "<set-?>");
                        c0Var.f129011c = b03;
                        m mVar = ((t) ((com.pinterest.feature.settings.permissions.f) jVar.getView())).f139732f0;
                        if (mVar != null) {
                            mVar.i(i14);
                        }
                    }
                    i14 = i16;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                q w14 = it.w("pinner_comments_phrase_filter_list");
                int size2 = w14.f91364a.size();
                String[] strArr2 = new String[size2];
                for (int i17 = 0; i17 < size2; i17++) {
                    String p14 = w14.u(i17).p();
                    if (p14 == null) {
                        p14 = "";
                    }
                    strArr2[i17] = p14;
                }
                List b04 = c0.b0(strArr2);
                jVar.f134529e.k(g52.c.settings_menu_comments_manual_filter_saved);
                for (Object obj2 : CollectionsKt.F0(jVar.f134531g.f135191h)) {
                    int i18 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    dl1.s sVar2 = (dl1.s) obj2;
                    if (sVar2 instanceof l0) {
                        l0 l0Var = (l0) sVar2;
                        l0Var.getClass();
                        Intrinsics.checkNotNullParameter(b04, "<set-?>");
                        l0Var.f129035c = b04;
                        m mVar2 = ((t) ((com.pinterest.feature.settings.permissions.f) jVar.getView())).f139732f0;
                        if (mVar2 != null) {
                            mVar2.i(i14);
                        }
                    }
                    i14 = i18;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f134517i) {
            case 0:
                e((u) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                e((u) obj);
                break;
            case 3:
                b((Throwable) obj);
                break;
            case 4:
                u uVar = (u) ((tt1.a) obj).c();
                Boolean bool = Boolean.FALSE;
                if (uVar != null && uVar.v("comments_phrase_filter_list_enabled") != null) {
                    nm.s v13 = uVar.v("comments_phrase_filter_list_enabled");
                    v13.getClass();
                    if (v13 instanceof v) {
                        try {
                            bool = Boolean.valueOf(uVar.v("comments_phrase_filter_list_enabled").b());
                        } catch (Exception unused) {
                        }
                    }
                }
                Intrinsics.checkNotNullExpressionValue(bool, "optBoolean(...)");
                j.t3(this.f134518j, true, bool.booleanValue());
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
