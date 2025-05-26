package ow;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public long f97853r;

    /* renamed from: s, reason: collision with root package name */
    public ww.g f97854s;

    /* renamed from: t, reason: collision with root package name */
    public int f97855t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f30 f97856u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p0 f97857v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f97858w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f30 f30Var, p0 p0Var, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f97856u = f30Var;
        this.f97857v = p0Var;
        this.f97858w = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f97856u, this.f97857v, this.f97858w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        ww.g gVar;
        com.iab.omid.library.pinterest.adsession.media.b bVar;
        long j13;
        long j14;
        ww.g gVar2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f97855t;
        if (i13 == 0) {
            ue.c.H(obj);
            String id3 = this.f97856u.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            p0 p0Var = this.f97857v;
            gVar = (ww.g) p0Var.f97871m.get(id3);
            if ((gVar != null ? gVar.f131165c : null) == null || (bVar = gVar.f131167e) == null) {
                ((pw.c) p0Var.f97861c).getClass();
                Intrinsics.checkNotNullParameter("ERROR: playback position changed for ad session or media events that do not exist.", "message");
                return Unit.f80348a;
            }
            if (gVar.f131172j) {
                return Unit.f80348a;
            }
            ww.i iVar = gVar.f131170h;
            long j15 = iVar.f131180c;
            j13 = this.f97858w;
            if (j15 >= 0 || j13 < 0) {
                long j16 = iVar.f131182e;
                if (j15 > j16 || j16 > j13) {
                    long j17 = iVar.f131183f;
                    if (j15 > j17 || j17 > j13) {
                        long j18 = iVar.f131184g;
                        if (j15 <= j18 && j18 <= j13) {
                            ww.b bVar2 = ww.b.THIRD_QUARTILE;
                            this.f97854s = gVar;
                            this.f97853r = j13;
                            this.f97855t = 3;
                            if (p0.b(p0Var, id3, bVar, bVar2, this) == aVar) {
                                return aVar;
                            }
                        } else if (j15 > j13) {
                            this.f97854s = gVar;
                            this.f97853r = j13;
                            this.f97855t = 4;
                            if (p0.g(p0Var, gVar, this) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        ww.b bVar3 = ww.b.MID_POINT;
                        this.f97854s = gVar;
                        this.f97853r = j13;
                        this.f97855t = 2;
                        if (p0.b(p0Var, id3, bVar, bVar3, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    ww.b bVar4 = ww.b.FIRST_QUARTILE;
                    this.f97854s = gVar;
                    this.f97853r = j13;
                    this.f97855t = 1;
                    if (p0.b(p0Var, id3, bVar, bVar4, this) == aVar) {
                        return aVar;
                    }
                }
                j14 = j13;
                gVar2 = gVar;
            }
            gVar.f131170h.f131180c = j13;
            return Unit.f80348a;
        }
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j14 = this.f97853r;
        gVar2 = this.f97854s;
        ue.c.H(obj);
        gVar = gVar2;
        j13 = j14;
        gVar.f131170h.f131180c = j13;
        return Unit.f80348a;
    }
}
