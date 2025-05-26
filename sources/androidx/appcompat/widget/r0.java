package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class r0 extends q0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f16675b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f16675b = appCompatTextView;
    }

    @Override // androidx.appcompat.widget.q0, androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void a(int i13) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i13);
    }

    @Override // androidx.appcompat.widget.q0, androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public final void i(int i13) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i13);
    }
}
