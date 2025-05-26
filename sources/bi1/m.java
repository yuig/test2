package bi1;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f22856r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f22857s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f22858t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f22859u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f22860v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View view, p pVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f22858t = view;
        this.f22859u = pVar;
        this.f22860v = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m mVar = new m(this.f22858t, this.f22859u, this.f22860v, cVar);
        mVar.f22857s = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((c) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00a9  */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bi1.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
