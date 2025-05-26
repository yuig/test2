package o90;

import com.pinterest.api.adapter.coroutine.NetworkResponse;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerPage;
import kl2.m;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import x02.x;

/* loaded from: classes5.dex */
public final class g extends dl2.j implements m {

    /* renamed from: r, reason: collision with root package name */
    public int f93792r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ o12.a f93793s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ String f93794t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ String f93795u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ CutoutPickerPage f93796v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CutoutPickerPage cutoutPickerPage, bl2.c cVar) {
        super(4, cVar);
        this.f93796v = cutoutPickerPage;
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        g gVar = new g(this.f93796v, (bl2.c) obj4);
        gVar.f93793s = (o12.a) obj;
        gVar.f93794t = (String) obj2;
        gVar.f93795u = (String) obj3;
        return gVar.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93792r;
        if (i13 != 0) {
            if (i13 == 1) {
                ue.c.H(obj);
                return (NetworkResponse) obj;
            }
            if (i13 == 2) {
                ue.c.H(obj);
                return (NetworkResponse) obj;
            }
            if (i13 == 3) {
                ue.c.H(obj);
                return (NetworkResponse) obj;
            }
            if (i13 == 4) {
                ue.c.H(obj);
                return (NetworkResponse) obj;
            }
            if (i13 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
            return (NetworkResponse) obj;
        }
        ue.c.H(obj);
        o12.a aVar2 = this.f93793s;
        String str = this.f93794t;
        String str2 = this.f93795u;
        CutoutPickerPage cutoutPickerPage = this.f93796v;
        if (!(cutoutPickerPage instanceof CutoutPickerPage.OriginPage)) {
            if (!(cutoutPickerPage instanceof CutoutPickerPage.BoardPage)) {
                return j.f93810b;
            }
            String str3 = ((CutoutPickerPage.BoardPage) cutoutPickerPage).f44679a;
            String str4 = j.f93809a;
            this.f93793s = null;
            this.f93794t = null;
            this.f93792r = 5;
            obj = aVar2.t(str3, false, true, str4, str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
            return (NetworkResponse) obj;
        }
        int i14 = f.f93791a[((CutoutPickerPage.OriginPage) cutoutPickerPage).f44681a.ordinal()];
        if (i14 == 1) {
            String str5 = j.f93809a;
            this.f93793s = null;
            this.f93794t = null;
            this.f93792r = 1;
            obj = aVar2.c(5, true, str5, str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
            return (NetworkResponse) obj;
        }
        if (i14 == 2) {
            String str6 = j.f93809a;
            this.f93793s = null;
            this.f93794t = null;
            this.f93792r = 2;
            obj = aVar2.g(str6, str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
            return (NetworkResponse) obj;
        }
        if (i14 != 3) {
            if (i14 != 4) {
                return j.f93810b;
            }
            String str7 = j.f93809a;
            this.f93793s = null;
            this.f93794t = null;
            this.f93792r = 4;
            obj = aVar2.s(str7, str, str2, this);
            if (obj == aVar) {
                return aVar;
            }
            return (NetworkResponse) obj;
        }
        String value = x.ALL_BOARDS_FILTER.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        String apiKey = bq.b.MOST_RECENT.getApiKey();
        String a13 = n00.b.a(n00.c.LIBRARY_BOARD_FEED);
        this.f93793s = null;
        this.f93794t = null;
        this.f93792r = 3;
        obj = aVar2.p(value, apiKey, a13, str, str2, this);
        if (obj == aVar) {
            return aVar;
        }
        return (NetworkResponse) obj;
    }
}
