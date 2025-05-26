package pe0;

import android.graphics.Typeface;
import android.widget.TextView;
import com.pinterest.design.brio.widget.PinterestEditText;
import com.pinterest.design.brio.widget.PinterestRadioButton;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements te0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f99928b;

    public /* synthetic */ b(TextView textView, int i13) {
        this.f99927a = i13;
        this.f99928b = textView;
    }

    @Override // te0.d
    public final void a(Typeface typeface) {
        int i13 = this.f99927a;
        TextView textView = this.f99928b;
        switch (i13) {
            case 0:
                ((PinterestEditText) textView).setTypeface(typeface);
                break;
            default:
                ((PinterestRadioButton) textView).setTypeface(typeface);
                break;
        }
    }
}
