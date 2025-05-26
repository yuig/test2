package cu;

import android.view.MotionEvent;
import androidx.recyclerview.widget.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class j extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53214i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f53215j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ MotionEvent f53216k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MotionEvent f53217l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f53218m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f53219n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(o0 o0Var, MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14, int i13) {
        super(0);
        this.f53214i = i13;
        this.f53215j = o0Var;
        this.f53216k = motionEvent;
        this.f53217l = motionEvent2;
        this.f53218m = f13;
        this.f53219n = f14;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean onFling;
        boolean onScroll;
        boolean onFling2;
        boolean onScroll2;
        float f13 = this.f53218m;
        float f14 = this.f53219n;
        o0 o0Var = this.f53215j;
        MotionEvent motionEvent = this.f53216k;
        MotionEvent motionEvent2 = this.f53217l;
        int i13 = this.f53214i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        onFling = super/*android.view.GestureDetector.SimpleOnGestureListener*/.onFling(motionEvent, motionEvent2, f13, f14);
                        return Boolean.valueOf(onFling);
                    default:
                        onScroll = super/*android.view.GestureDetector.SimpleOnGestureListener*/.onScroll(motionEvent, motionEvent2, f13, f14);
                        return Boolean.valueOf(onScroll);
                }
            default:
                switch (i13) {
                    case 0:
                        onFling2 = super/*android.view.GestureDetector.SimpleOnGestureListener*/.onFling(motionEvent, motionEvent2, f13, f14);
                        return Boolean.valueOf(onFling2);
                    default:
                        onScroll2 = super/*android.view.GestureDetector.SimpleOnGestureListener*/.onScroll(motionEvent, motionEvent2, f13, f14);
                        return Boolean.valueOf(onScroll2);
                }
        }
    }
}
