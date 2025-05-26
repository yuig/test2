package ha2;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.pinterest.api.model.wy0;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.identity.core.error.AccountException;
import com.pinterest.ui.components.sections.LegoSectionRepPinPreview;
import com.pinterest.ui.components.users.LegoUserRep;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.f0;
import u50.k0;
import v.f1;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68442i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f68443j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f68444k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13, Object obj, Object obj2) {
        super(1);
        this.f68442i = i13;
        this.f68443j = obj;
        this.f68444k = obj2;
    }

    public final rn1.a b(rn1.a it) {
        k0 k0Var;
        int i13 = this.f68442i;
        Object obj = this.f68444k;
        Object obj2 = this.f68443j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = ((l) obj2).getResources().getString(((Integer) obj).intValue());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence string2 = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(string2, "string");
                f0 f0Var = new f0(string2);
                x xVar = (x) obj;
                vn1.c cVar = xVar.f68480d;
                if (cVar == null) {
                    cVar = it.f108850h;
                }
                vn1.c cVar2 = cVar;
                vn1.g gVar = xVar.f68481e;
                if (gVar == null) {
                    gVar = it.f108853k;
                }
                vn1.g gVar2 = gVar;
                Integer num = xVar.f68478b;
                if (num != null) {
                    int intValue = num.intValue();
                    String[] formatArgs = new String[0];
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    k0Var = new k0(intValue, new ArrayList(0));
                } else {
                    k0Var = null;
                }
                return rn1.a.y(it, f0Var, cVar2, null, null, gVar2, 0, null, null, null, null, false, 0, k0Var, null, null, null, null, false, null, null, 2093036);
        }
    }

    public final void e(OutputStream stream) {
        rg2.a aVar;
        BufferedInputStream bufferedInputStream;
        int i13 = this.f68442i;
        Object obj = this.f68444k;
        Object obj2 = this.f68443j;
        switch (i13) {
            case 24:
                Intrinsics.checkNotNullParameter(stream, "stream");
                qg2.e eVar = (qg2.e) obj2;
                String str = (String) obj;
                ReentrantReadWriteLock c13 = eVar.c(str);
                Intrinsics.checkNotNullExpressionValue(c13, "findLock(name)");
                ReentrantReadWriteLock.ReadLock readLock = c13.readLock();
                readLock.lock();
                try {
                    File a13 = eVar.f103856a.a("emb_" + str);
                    try {
                        xk2.q qVar = xk2.s.f135225b;
                        aVar = new rg2.a(stream);
                        try {
                            InputStream fileInputStream = new FileInputStream(a13);
                            bufferedInputStream = fileInputStream instanceof BufferedInputStream ? (BufferedInputStream) fileInputStream : new BufferedInputStream(fileInputStream, 8192);
                        } finally {
                        }
                    } catch (Throwable th3) {
                        xk2.q qVar2 = xk2.s.f135225b;
                        ue.c.m(th3);
                    }
                    try {
                        bs1.c.K(bufferedInputStream, aVar, 8192);
                        dl2.b.J(bufferedInputStream, null);
                        dl2.b.J(aVar, null);
                        Unit unit = Unit.f80348a;
                        return;
                    } finally {
                    }
                } finally {
                    readLock.unlock();
                }
            default:
                Intrinsics.checkNotNullParameter(stream, "stream");
                aVar = new rg2.a(stream);
                try {
                    ((qg2.i) obj2).f103870c.b((Envelope) obj, Envelope.f73106f);
                    Unit unit2 = Unit.f80348a;
                    dl2.b.J(aVar, null);
                    return;
                } finally {
                }
        }
    }

    public final void f(Throwable th3) {
        String string;
        f1 f1Var;
        qz.d M;
        int i13 = this.f68442i;
        Object obj = this.f68444k;
        Object obj2 = this.f68443j;
        switch (i13) {
            case 4:
                LegoSectionRepPinPreview legoSectionRepPinPreview = (LegoSectionRepPinPreview) obj2;
                int i14 = LegoSectionRepPinPreview.f52329l;
                legoSectionRepPinPreview.getClass();
                legoSectionRepPinPreview.f52330a.set(((na2.c) obj).getIndex(), la2.d.f82554a);
                break;
            case 10:
                if (!(th3 instanceof AccountException.InvalidUserNameOrEmailException)) {
                    i92.k kVar = ((lb2.d) obj2).f82753h;
                    NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                    if (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || (M = k3.M(f1Var)) == null || (string = M.f105384d) == null) {
                        string = ((Context) obj).getString(x0.generic_error);
                    }
                    kVar.i(string);
                    break;
                } else {
                    lu1.b bVar = ((lb2.d) obj2).f82751f;
                    Context context = (Context) obj;
                    Uri parse = Uri.parse(context.getString(x0.url_password_reset));
                    Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                    ((lu1.c) bVar).s(context, parse, context.getString(x0.reset_password));
                    break;
                }
                break;
            default:
                ((i92.k) ((android.support.v4.media.a) obj2).f15841e).i(((Resources) obj).getString(x0.generic_error));
                break;
        }
    }

    public final void h(nk1.h hVar) {
        int i13 = this.f68442i;
        Object obj = this.f68444k;
        Object obj2 = this.f68443j;
        switch (i13) {
            case 5:
                oa2.g gVar = (oa2.g) obj2;
                if (gVar.isBound()) {
                    oa2.t tVar = (oa2.t) gVar.getView();
                    Intrinsics.f(hVar);
                    LegoUserRep legoUserRep = (LegoUserRep) tVar;
                    legoUserRep.G0((yl1.b) gVar.f93894h.invoke(hVar, gVar.f93900n, Boolean.valueOf(gVar.q3((z40.y) obj))));
                    break;
                }
                break;
            default:
                oa2.o oVar = (oa2.o) obj2;
                oa2.t tVar2 = (oa2.t) oVar.getView();
                Intrinsics.f(hVar);
                LegoUserRep legoUserRep2 = (LegoUserRep) tVar2;
                legoUserRep2.G0((yl1.b) oVar.f93930h.invoke(hVar, oVar.f93937o, Boolean.valueOf(oVar.q3((wy0) obj))));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0395  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ha2.i.invoke(java.lang.Object):java.lang.Object");
    }
}
