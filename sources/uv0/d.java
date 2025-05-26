package uv0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123161i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ uj2.c f123162j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(uj2.c cVar, int i13) {
        super(0);
        this.f123161i = i13;
        this.f123162j = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f123161i) {
            case 0:
                m272invoke();
                break;
            case 1:
                m272invoke();
                break;
            case 2:
                m272invoke();
                break;
            case 3:
                m272invoke();
                break;
            case 4:
                m272invoke();
                break;
            case 5:
                m272invoke();
                break;
            case 6:
                m272invoke();
                break;
            case 7:
                m272invoke();
                break;
            case 8:
                m272invoke();
                break;
            case 9:
                m272invoke();
                break;
            case 10:
                m272invoke();
                break;
            default:
                m272invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m272invoke() {
        int i13 = this.f123161i;
        uj2.c cVar = this.f123162j;
        switch (i13) {
            case 0:
                ((fk2.f) cVar).b();
                break;
            case 1:
                ((fk2.f) cVar).d(new RuntimeException("Failed to set Idea Pin board sticker"));
                break;
            case 2:
                ((fk2.f) cVar).b();
                break;
            case 3:
                ((fk2.f) cVar).b();
                break;
            case 4:
                ((fk2.f) cVar).b();
                break;
            case 5:
                ((fk2.f) cVar).d(new RuntimeException("Failed to set Idea Pin mention tag"));
                break;
            case 6:
                ((fk2.f) cVar).b();
                break;
            case 7:
                ((fk2.f) cVar).b();
                break;
            case 8:
                ((fk2.f) cVar).b();
                break;
            case 9:
                ((fk2.f) cVar).d(new RuntimeException("Failed to set Idea Pin sticker"));
                break;
            case 10:
                ((fk2.f) cVar).b();
                break;
            default:
                ((fk2.f) cVar).d(new RuntimeException("Failed to set Idea Pin vto product tag"));
                break;
        }
    }
}
