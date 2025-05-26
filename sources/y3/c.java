package y3;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import ao2.j0;
import java.util.function.Consumer;
import kh2.n3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f136691r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f136692s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureSession f136693t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Rect f136694u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Consumer f136695v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, bl2.c cVar) {
        super(2, cVar);
        this.f136692s = gVar;
        this.f136693t = scrollCaptureSession;
        this.f136694u = rect;
        this.f136695v = consumer;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f136692s, this.f136693t, this.f136694u, this.f136695v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f136691r;
        if (i13 == 0) {
            ue.c.H(obj);
            Rect rect = this.f136694u;
            n4.i iVar = new n4.i(rect.left, rect.top, rect.right, rect.bottom);
            this.f136691r = 1;
            obj = g.a(this.f136692s, this.f136693t, iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f136695v.accept(n3.M0((n4.i) obj));
        return Unit.f80348a;
    }
}
