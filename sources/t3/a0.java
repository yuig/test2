package t3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f115830b;

    public /* synthetic */ a0(int i13, Function0 function0) {
        this.f115829a = i13;
        this.f115830b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f115829a;
        Function0 task = this.f115830b;
        switch (i13) {
            case 0:
                task.invoke();
                break;
            case 1:
                int i14 = p4.j.f98793w;
                task.invoke();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(task, "$task");
                task.invoke();
                break;
            default:
                Intrinsics.checkNotNullParameter(task, "$saveModels");
                task.invoke();
                break;
        }
    }
}
