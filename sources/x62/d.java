package x62;

import com.pinterest.shuffles.cutout.editor.ui.refine.EditMaskImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f133967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f133968c;

    public /* synthetic */ d(Function1 function1, g gVar, int i13) {
        this.f133966a = i13;
        this.f133967b = function1;
        this.f133968c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f133966a;
        g snapshot = this.f133968c;
        Function1 onPop = this.f133967b;
        switch (i13) {
            case 0:
                ql2.g gVar = EditMaskImageView.f51946q;
                Intrinsics.checkNotNullParameter(onPop, "$onPop");
                Intrinsics.checkNotNullParameter(snapshot, "$snapshot");
                onPop.invoke(snapshot);
                break;
            default:
                ql2.g gVar2 = EditMaskImageView.f51946q;
                Intrinsics.checkNotNullParameter(onPop, "$onPush");
                Intrinsics.checkNotNullParameter(snapshot, "$snapshot");
                onPop.invoke(snapshot);
                break;
        }
    }
}
