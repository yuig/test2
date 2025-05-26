package hi2;

import android.view.View;
import android.view.Window;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69244i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f69245j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f69246k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function0 f69247l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function0 f69248m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f69249n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Window window, f fVar, int i13, Function0 function0, Function0 function02) {
        super(0);
        this.f69249n = window;
        this.f69245j = fVar;
        this.f69246k = i13;
        this.f69247l = function0;
        this.f69248m = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f69244i) {
            case 0:
                m149invoke();
                break;
            default:
                m149invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, int i13, Function0 function0, Function0 function02, View view) {
        super(0);
        this.f69245j = fVar;
        this.f69246k = i13;
        this.f69247l = function0;
        this.f69248m = function02;
        this.f69249n = view;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m149invoke() {
        int i13 = this.f69244i;
        Object obj = this.f69249n;
        switch (i13) {
            case 0:
                f fVar = this.f69245j;
                ConcurrentHashMap concurrentHashMap = fVar.f69252b;
                int i14 = this.f69246k;
                if (!concurrentHashMap.containsKey(Integer.valueOf(i14))) {
                    this.f69247l.invoke();
                    ConcurrentHashMap concurrentHashMap2 = fVar.f69252b;
                    Integer valueOf = Integer.valueOf(i14);
                    Function0 function0 = this.f69248m;
                    concurrentHashMap2.put(valueOf, function0);
                    ((View) obj).getViewTreeObserver().registerFrameCommitCallback(new p4.a(16, function0));
                    break;
                }
                break;
            default:
                View decorView = ((Window) obj).getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
                Function0 function02 = this.f69247l;
                Function0 function03 = this.f69248m;
                f fVar2 = this.f69245j;
                d dVar = new d(fVar2, this.f69246k, function02, function03, decorView);
                fVar2.getClass();
                decorView.getViewTreeObserver().addOnDrawListener(new a(decorView, dVar));
                break;
        }
    }
}
