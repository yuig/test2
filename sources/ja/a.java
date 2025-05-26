package ja;

import android.app.DownloadManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.bp;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.zk0;
import com.pinterest.error.ServerError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i01.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jk2.w0;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75146i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f75147j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f75148k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f75149l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f75150m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f75151n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f21.e eVar, f30 f30Var, q0 q0Var, String str) {
        super(1);
        this.f75146i = 3;
        this.f75148k = eVar;
        this.f75150m = f30Var;
        this.f75149l = -1;
        this.f75151n = q0Var;
        this.f75147j = str;
    }

    public final void b(Throwable throwable) {
        int i13 = this.f75146i;
        Object obj = this.f75147j;
        Object obj2 = this.f75151n;
        Object obj3 = this.f75150m;
        Object obj4 = this.f75148k;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                i11.q qVar = (i11.q) obj4;
                f30 f30Var = (f30) obj3;
                String str = (String) obj;
                String str2 = str == null ? "" : str;
                boolean z13 = str == null;
                uk1.d presenterPinalytics = qVar.getPresenterPinalytics();
                Intrinsics.g(presenterPinalytics, "null cannot be cast to non-null type com.pinterest.feature.pin.create.analytics.BoardPickerPinalytics");
                String str3 = qVar.f71024y;
                ((g11.a) presenterPinalytics).b(f30Var, null, str2, this.f75149l, z13, (List) obj2, qVar.f71023x, str3);
                if (qVar.isBound()) {
                    ((l11.j) ((f11.d) qVar.getView())).w3(throwable.getMessage());
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if ((throwable instanceof ServerError) && !((ServerError) throwable).f45045b) {
                    f21.e eVar = (f21.e) obj4;
                    eVar.f60964c.i(((yk1.a) eVar.f60967f).f139224a.getString(x0.oops_something_went_wrong));
                }
                e1.a(((f21.e) obj4).f60966e, (f30) obj3, null, "", this.f75149l, true, (List) obj2, (String) obj, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long l13;
        ek2.j jVar;
        int i13 = this.f75146i;
        int i14 = 1;
        int i15 = this.f75149l;
        Object obj2 = this.f75151n;
        Object obj3 = this.f75150m;
        Object obj4 = this.f75148k;
        Object obj5 = this.f75147j;
        switch (i13) {
            case 1:
                i11.m mVar = (i11.m) obj3;
                String str = (String) obj5;
                String boardName = (String) obj4;
                Intrinsics.checkNotNullParameter(boardName, "boardName");
                String str2 = (String) obj2;
                String q13 = b40.q(mVar.K);
                ArrayList suggestedBoards = mVar.S;
                Intrinsics.checkNotNullParameter(suggestedBoards, "suggestedBoards");
                if (boardName != null) {
                    mVar.U3(new h11.d(str, boardName, str2, q13, false, false, this.f75149l, null, suggestedBoards));
                    return Unit.f80348a;
                }
                Intrinsics.r("boardName");
                throw null;
            case 2:
                b((Throwable) obj);
                return Unit.f80348a;
            case 3:
                b((Throwable) obj);
                return Unit.f80348a;
            case 4:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(((y31.q) obj5).e(((CharSequence) obj4).toString(), (Drawable) obj3, i15, (Function0) obj2)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 5:
                k50.a aVar = (k50.a) obj;
                i91.n nVar = (i91.n) obj4;
                if (nVar.f71877g != null) {
                    if (aVar == null) {
                        new Throwable("Server response was null.");
                        nVar.h((Context) obj3);
                    } else {
                        String b13 = aVar.b();
                        String a13 = aVar.a();
                        if (b13 != null && !kotlin.text.z.j(b13)) {
                            Context context = (Context) obj3;
                            context.registerReceiver(nVar.f71882l, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(b13));
                            request.allowScanningByMediaScanner();
                            request.setNotificationVisibility(1);
                            i91.h hVar = nVar.f71877g;
                            request.setDestinationUri(Uri.fromFile(hVar != null ? new File(hVar.a()) : null));
                            i91.h hVar2 = nVar.f71877g;
                            if (hVar2 != null) {
                                Object systemService = context.getSystemService("download");
                                Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                                hVar2.f71836c = Long.valueOf(((DownloadManager) systemService).enqueue(request));
                            }
                            Object systemService2 = context.getSystemService("download");
                            Intrinsics.g(systemService2, "null cannot be cast to non-null type android.app.DownloadManager");
                            DownloadManager downloadManager = (DownloadManager) systemService2;
                            i91.h hVar3 = nVar.f71877g;
                            if (hVar3 != null && (l13 = hVar3.f71836c) != null) {
                                long longValue = l13.longValue();
                                ek2.j jVar2 = nVar.f71880j;
                                if (jVar2 != null && !jVar2.isDisposed() && (jVar = nVar.f71880j) != null) {
                                    bk2.c.dispose(jVar);
                                }
                                nVar.f71880j = (ek2.j) new w0(new fe0.a(downloadManager, longValue, i14)).H(tk2.e.f118017c).m(100L, TimeUnit.MILLISECONDS, tk2.e.f118016b).F(new x81.h0(6, new j41.i(nVar, 22)), new x81.h0(7, new i91.k(nVar, context, i14)), ck2.i.f27923c, ck2.i.f27924d);
                            }
                        } else if (a13 == null || kotlin.text.z.j(a13)) {
                            nVar.h((Context) obj3);
                        } else {
                            nVar.f((Context) obj3, (i91.o) obj2, (String) obj5, a13, i15 + 1);
                        }
                    }
                }
                return Unit.f80348a;
            default:
                f30 pin = (f30) obj;
                sf1.t tVar = (sf1.t) ((rf1.p) obj5).getView();
                zk0 blockStyle = (zk0) obj4;
                bp bpVar = (bp) obj3;
                Double p13 = bpVar.p();
                Intrinsics.checkNotNullExpressionValue(p13, "getStartTime(...)");
                double doubleValue = p13.doubleValue();
                Double l14 = bpVar.l();
                Intrinsics.checkNotNullExpressionValue(l14, "getEndTime(...)");
                double doubleValue2 = l14.doubleValue();
                Intrinsics.f(pin);
                rp0.d questionComment = (rp0.d) obj2;
                boolean z13 = !pin.Q3().booleanValue();
                sf1.s sVar = (sf1.s) tVar;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
                Intrinsics.checkNotNullParameter(pin, "pin");
                Intrinsics.checkNotNullParameter(questionComment, "questionComment");
                sf1.j jVar3 = new sf1.j(sVar, blockStyle);
                Context context2 = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                float f13 = jVar3.f112624a;
                float f14 = jVar3.f112625b;
                sp0.d dVar = new sp0.d(f13, f14);
                int i16 = jVar3.f112626c;
                int i17 = jVar3.f112627d;
                sVar.addView(new androidx.appcompat.widget.g(context2, new sp0.e(dVar, new sp0.a(i16, i17), new sp0.a(sVar.f112699f, sVar.f112700g), jVar3.f112628e, new sp0.b(doubleValue, doubleValue2), new k1.b0(z13, sVar, pin, questionComment, 14), sVar), sVar.q()));
                sf1.w0 w0Var = sVar.C;
                if (w0Var != null) {
                    w0Var.b(f13, f14, i17, i15);
                }
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i11.m mVar, String str, String str2, String str3, int i13) {
        super(1);
        this.f75146i = 1;
        this.f75150m = mVar;
        this.f75147j = str;
        this.f75148k = str2;
        this.f75151n = str3;
        this.f75149l = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i11.q qVar, f30 f30Var, String str, int i13, List list) {
        super(1);
        this.f75146i = 2;
        this.f75148k = qVar;
        this.f75150m = f30Var;
        this.f75147j = str;
        this.f75149l = i13;
        this.f75151n = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i91.n nVar, Context context, i91.o oVar, String str, int i13) {
        super(1);
        this.f75146i = 5;
        this.f75148k = nVar;
        this.f75150m = context;
        this.f75151n = oVar;
        this.f75147j = str;
        this.f75149l = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i13, Object obj4, int i14) {
        super(1);
        this.f75146i = i14;
        this.f75147j = obj;
        this.f75148k = obj2;
        this.f75150m = obj3;
        this.f75149l = i13;
        this.f75151n = obj4;
    }
}
