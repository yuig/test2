package l62;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import r72.u1;

/* loaded from: classes4.dex */
public final class g0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f81639r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ vh.a f81640s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(vh.a aVar, bl2.c cVar) {
        super(2, cVar);
        this.f81640s = aVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g0(this.f81640s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        ClipDescription primaryClipDescription;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f81639r;
        vh.a aVar2 = this.f81640s;
        if (i13 == 0) {
            ue.c.H(obj);
            j62.a aVar3 = (j62.a) aVar2.f125802d;
            this.f81639r = 1;
            i62.b bVar = (i62.b) aVar3;
            ClipboardManager clipboardManager = bVar.f71632c;
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            obj = (primaryClip == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) ? null : kotlin.jvm.internal.j.M(this, bVar.f71631b.f89707c, new i62.a(primaryClipDescription, primaryClip, bVar, null));
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        u1 u1Var = (u1) obj;
        if (u1Var != null) {
            aVar2.a(u1Var, true);
        }
        return Unit.f80348a;
    }
}
