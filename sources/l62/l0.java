package l62;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r72.f2;

/* loaded from: classes4.dex */
public final class l0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f81656r;

    /* renamed from: s, reason: collision with root package name */
    public f2 f81657s;

    /* renamed from: t, reason: collision with root package name */
    public int f81658t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n0 f81659u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bitmap f81660v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, Bitmap bitmap, bl2.c cVar) {
        super(2, cVar);
        this.f81659u = n0Var;
        this.f81660v = bitmap;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l0(this.f81659u, this.f81660v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0141  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l62.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
