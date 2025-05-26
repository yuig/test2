package androidx.appcompat.widget;

/* loaded from: classes2.dex */
public final class s0 extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f16682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f16682c = appCompatTextView;
    }

    @Override // androidx.appcompat.widget.q0, androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void d(int i13, float f13) {
        super/*android.widget.TextView*/.setLineHeight(i13, f13);
    }
}
