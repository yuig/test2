package x52;

import android.os.Environment;
import androidx.compose.foundation.lazy.layout.z0;
import ao2.j0;
import ao2.k2;
import h32.f1;
import java.io.File;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes4.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f133839r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f133840s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ an0.g f133841t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d0 f133842u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function1 f133843v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function1 f133844w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, an0.g gVar, d0 d0Var, Function1 function1, Function1 function12, bl2.c cVar) {
        super(2, cVar);
        this.f133840s = nVar;
        this.f133841t = gVar;
        this.f133842u = d0Var;
        this.f133843v = function1;
        this.f133844w = function12;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f133840s, this.f133841t, this.f133842u, this.f133843v, this.f133844w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object b13;
        File file;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f133839r;
        an0.g gVar = this.f133841t;
        n nVar = this.f133840s;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f133839r = 1;
            b13 = n.b(nVar, gVar, this);
            if (b13 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
            b13 = obj;
        }
        ke2.c cVar = (ke2.c) b13;
        nVar.getClass();
        f1 f1Var = f1.BOARD_SHARE_VIDEO_EXPORT_ATTEMPTED;
        HashMap o13 = bs1.c.o(new Pair("item_id", gVar.f15653a));
        d0 d0Var = this.f133842u;
        d0Var.g(f1Var, null, o13, false);
        File d2 = nVar.d();
        boolean contains = f0.j("2001001", "2003003").contains(gVar.f15653a);
        if (contains) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            Intrinsics.checkNotNullExpressionValue(externalStoragePublicDirectory, "getExternalStoragePublicDirectory(...)");
            File file2 = new File(a.a.l(externalStoragePublicDirectory.getPath(), "/", nVar.f133898h, "-temp"));
            if (file2.exists()) {
                file2.delete();
            }
            file = file2;
        } else {
            file = d2;
        }
        int i14 = contains ? 50 : 100;
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        k2 z13 = kotlin.jvm.internal.j.z(nVar.f133892b, null, null, new m(contains, d0Var, gVar, nVar, this.f133844w, cVar, j0Var, file, i14, d2, this.f133843v, null), 3);
        z13.invokeOnCompletion(new z0(15, j0Var));
        nVar.f133899i = z13;
        return Unit.f80348a;
    }
}
