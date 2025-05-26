package j91;

import android.content.Context;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import lr.u;
import pk.a0;
import so.oa;
import z40.t;

/* loaded from: classes5.dex */
public final class e extends dr.i {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f75118e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dr.k f75119f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(dp.c cVar, TypeAheadItem contact, int i13) {
        super(cVar, contact, i13);
        Intrinsics.checkNotNullParameter(null, "sendStatusTextView");
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f75119f = cVar;
        Intrinsics.checkNotNullParameter(null, "<set-?>");
        cVar.L = null;
    }

    @Override // dr.i
    public final void b(Throwable th3) {
        int i13 = this.f75118e;
        dr.k kVar = this.f75119f;
        switch (i13) {
            case 0:
                super.b(th3);
                dp.c cVar = (dp.c) kVar;
                GestaltText gestaltText = (GestaltText) cVar.L;
                if (gestaltText == null) {
                    Intrinsics.r("sendStatusTextView");
                    throw null;
                }
                a0.q(gestaltText, bs1.c.h2(""));
                Context context = kb0.a.f79058b;
                i92.k E2 = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
                TypeAheadItem contact = this.f56179a;
                Intrinsics.checkNotNullExpressionValue(contact, "contact");
                E2.c(new u(contact, null, er.d.ERROR, (z70.m) cVar.f56031J, (lu1.b) cVar.K));
                return;
            default:
                super.b(th3);
                Context context2 = kb0.a.f79058b;
                i92.k E22 = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
                TypeAheadItem contact2 = this.f56179a;
                Intrinsics.checkNotNullExpressionValue(contact2, "contact");
                n nVar = (n) kVar;
                E22.c(new u(contact2, null, er.d.ERROR, nVar.I, nVar.f75145J));
                return;
        }
    }

    @Override // dr.i
    public final void c(t tVar) {
        String A;
        TypeAheadItem typeAheadItem = this.f56179a;
        int i13 = this.f75118e;
        dr.k kVar = this.f75119f;
        switch (i13) {
            case 0:
                super.c(tVar);
                String a13 = tVar.a();
                if (a13 != null && (A = typeAheadItem.A()) != null) {
                }
                if (a13 != null) {
                    TypeAheadItem contact = this.f56179a;
                    Intrinsics.checkNotNullExpressionValue(contact, "contact");
                    dp.c cVar = (dp.c) kVar;
                    u uVar = new u(contact, a13, er.d.SENT, (z70.m) cVar.f56031J, (lu1.b) cVar.K);
                    if ((typeAheadItem.l() != null ? typeAheadItem.l() : "") != null) {
                        Context context = kb0.a.f79058b;
                        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(uVar);
                        break;
                    }
                }
                break;
            default:
                super.c(tVar);
                String a14 = tVar.a();
                String A2 = typeAheadItem.A();
                if (A2 != null && a14 != null) {
                    dr.a.f56159d.put(A2, a14);
                }
                if (a14 != null) {
                    n nVar = (n) kVar;
                    TypeAheadItem contact2 = this.f56179a;
                    Intrinsics.checkNotNullExpressionValue(contact2, "contact");
                    u uVar2 = new u(contact2, a14, er.d.SENT, nVar.I, nVar.f75145J);
                    if ((typeAheadItem.l() != null ? typeAheadItem.l() : "") != null) {
                        Context context2 = kb0.a.f79058b;
                        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(uVar2);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, TypeAheadItem contact, int i13) {
        super(nVar, contact, i13);
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f75119f = nVar;
    }
}
