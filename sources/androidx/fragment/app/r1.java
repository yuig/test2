package androidx.fragment.app;

import android.util.Log;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class r1 extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18425a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f18427c = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);

    /* renamed from: b, reason: collision with root package name */
    public final Object f18426b = "FragmentManager";

    public final void a() {
        if (((StringBuilder) this.f18427c).length() > 0) {
            Log.d((String) this.f18426b, ((StringBuilder) this.f18427c).toString());
            CharSequence charSequence = this.f18427c;
            ((StringBuilder) charSequence).delete(0, ((StringBuilder) charSequence).length());
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.f18425a) {
            case 1:
                return append(charSequence);
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f18425a) {
            case 0:
                a();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f18425a) {
            case 0:
                a();
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i13, int i14) {
        switch (this.f18425a) {
            case 0:
                for (int i15 = 0; i15 < i14; i15++) {
                    char c13 = cArr[i13 + i15];
                    if (c13 == '\n') {
                        a();
                    } else {
                        ((StringBuilder) this.f18427c).append(c13);
                    }
                }
                break;
            default:
                pm.t tVar = (pm.t) this.f18427c;
                tVar.getClass();
                tVar.getClass();
                ((Appendable) this.f18426b).append(tVar, i13, i14 + i13);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i13, int i14) {
        switch (this.f18425a) {
            case 1:
                return append(charSequence, i13, i14);
            default:
                return super.append(charSequence, i13, i14);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        switch (this.f18425a) {
            case 1:
                ((Appendable) this.f18426b).append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i13, int i14) {
        switch (this.f18425a) {
            case 1:
                ((Appendable) this.f18426b).append(charSequence, i13, i14);
                return this;
            default:
                return super.append(charSequence, i13, i14);
        }
    }

    @Override // java.io.Writer
    public final void write(int i13) {
        switch (this.f18425a) {
            case 1:
                ((Appendable) this.f18426b).append((char) i13);
                break;
            default:
                super.write(i13);
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i13, int i14) {
        switch (this.f18425a) {
            case 1:
                Objects.requireNonNull(str);
                ((Appendable) this.f18426b).append(str, i13, i14 + i13);
                break;
            default:
                super.write(str, i13, i14);
                break;
        }
    }
}
