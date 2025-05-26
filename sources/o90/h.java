package o90;

import com.pinterest.collagesCoreLibrary.model.CutoutPickerPage;
import java.util.List;
import kl2.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m90.b0;
import m90.c0;
import m90.d0;
import m90.e0;

/* loaded from: classes5.dex */
public final class h extends dl2.j implements m {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f93797r;

    /* renamed from: s, reason: collision with root package name */
    public int f93798s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ o12.a f93799t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ String f93800u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ String f93801v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f93802w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, bl2.c cVar, int i13) {
        super(4, cVar);
        this.f93797r = i13;
        this.f93802w = obj;
    }

    @Override // kl2.m
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f93797r) {
        }
        return r((o12.a) obj, (String) obj2, (String) obj3, (bl2.c) obj4);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object d2;
        m gVar;
        Object c13;
        int i13 = this.f93797r;
        bl2.c cVar = null;
        Object obj2 = this.f93802w;
        switch (i13) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                int i14 = this.f93798s;
                if (i14 == 0) {
                    ue.c.H(obj);
                    o12.a aVar2 = this.f93799t;
                    String str = this.f93800u;
                    String str2 = this.f93801v;
                    String Z = CollectionsKt.Z((List) obj2, ",", null, null, 0, null, null, 62);
                    if (Z.length() == 0) {
                        Z = "";
                    }
                    String str3 = j.f93809a;
                    this.f93799t = null;
                    this.f93800u = null;
                    this.f93798s = 1;
                    d2 = aVar2.d(Z, str3, str, str2, this);
                    if (d2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                    d2 = obj;
                }
                return d2;
            default:
                cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
                int i15 = this.f93798s;
                if (i15 == 0) {
                    ue.c.H(obj);
                    o12.a aVar4 = this.f93799t;
                    String str4 = this.f93800u;
                    String str5 = this.f93801v;
                    e0 e0Var = (e0) obj2;
                    if (e0Var instanceof c0) {
                        List pinIds = ((c0) e0Var).f86640a;
                        String str6 = j.f93809a;
                        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
                        gVar = new h(pinIds, cVar, 0);
                    } else if (e0Var instanceof d0) {
                        d0 d0Var = (d0) e0Var;
                        String query = d0Var.f86643a;
                        String str7 = j.f93809a;
                        Intrinsics.checkNotNullParameter(query, "query");
                        za0.b type = d0Var.f86644b;
                        Intrinsics.checkNotNullParameter(type, "type");
                        gVar = new i(query, type, null);
                    } else {
                        if (!(e0Var instanceof b0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CutoutPickerPage page = ((b0) e0Var).f86631a;
                        String str8 = j.f93809a;
                        Intrinsics.checkNotNullParameter(page, "page");
                        gVar = new g(page, null);
                    }
                    this.f93799t = null;
                    this.f93800u = null;
                    this.f93798s = 1;
                    c13 = gVar.c(aVar4, str4, str5, this);
                    if (c13 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                    c13 = obj;
                }
                return c13;
        }
    }

    public final Object r(o12.a aVar, String str, String str2, bl2.c cVar) {
        int i13 = this.f93797r;
        Object obj = this.f93802w;
        switch (i13) {
            case 0:
                h hVar = new h((List) obj, cVar, 0);
                hVar.f93799t = aVar;
                hVar.f93800u = str;
                hVar.f93801v = str2;
                return hVar.invokeSuspend(Unit.f80348a);
            default:
                h hVar2 = new h((e0) obj, cVar, 1);
                hVar2.f93799t = aVar;
                hVar2.f93800u = str;
                hVar2.f93801v = str2;
                return hVar2.invokeSuspend(Unit.f80348a);
        }
    }
}
