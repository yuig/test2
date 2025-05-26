package h6;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f0 extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Class f67711a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f67712b;

    public f0(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f67712b = new ArrayList();
        com.bumptech.glide.d.s(cls, "watcherClass cannot be null");
        this.f67711a = cls;
    }

    public final void a() {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f67712b;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((e0) arrayList.get(i13)).f67709b.incrementAndGet();
            i13++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f67712b;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((e0) arrayList.get(i13)).onTextChanged(this, 0, length(), length());
            i13++;
        }
    }

    public final e0 c(Object obj) {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f67712b;
            if (i13 >= arrayList.size()) {
                return null;
            }
            e0 e0Var = (e0) arrayList.get(i13);
            if (e0Var.f67708a == obj) {
                return e0Var;
            }
            i13++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f67711a == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i13, int i14) {
        super.delete(i13, i14);
        return this;
    }

    public final void e() {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f67712b;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((e0) arrayList.get(i13)).f67709b.decrementAndGet();
            i13++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        e0 c13;
        if (d(obj) && (c13 = c(obj)) != null) {
            obj = c13;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        e0 c13;
        if (d(obj) && (c13 = c(obj)) != null) {
            obj = c13;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        e0 c13;
        if (d(obj) && (c13 = c(obj)) != null) {
            obj = c13;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i13, int i14, Class cls) {
        if (this.f67711a != cls) {
            return super.getSpans(i13, i14, cls);
        }
        e0[] e0VarArr = (e0[]) super.getSpans(i13, i14, e0.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, e0VarArr.length);
        for (int i15 = 0; i15 < e0VarArr.length; i15++) {
            objArr[i15] = e0VarArr[i15].f67708a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i13, CharSequence charSequence) {
        super.insert(i13, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i13, int i14, Class cls) {
        if (cls == null || this.f67711a == cls) {
            cls = e0.class;
        }
        return super.nextSpanTransition(i13, i14, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        e0 e0Var;
        if (d(obj)) {
            e0Var = c(obj);
            if (e0Var != null) {
                obj = e0Var;
            }
        } else {
            e0Var = null;
        }
        super.removeSpan(obj);
        if (e0Var != null) {
            this.f67712b.remove(e0Var);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i13, int i14, CharSequence charSequence) {
        replace(i13, i14, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i13, int i14, int i15) {
        if (d(obj)) {
            e0 e0Var = new e0(obj);
            this.f67712b.add(e0Var);
            obj = e0Var;
        }
        super.setSpan(obj, i13, i14, i15);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i13, int i14) {
        return new f0(this.f67711a, this, i13, i14);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i13, int i14) {
        super.delete(i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i13, CharSequence charSequence) {
        super.insert(i13, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i13, int i14, CharSequence charSequence, int i15, int i16) {
        replace(i13, i14, charSequence, i15, i16);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i13, CharSequence charSequence, int i14, int i15) {
        super.insert(i13, charSequence, i14, i15);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i13, int i14, CharSequence charSequence) {
        a();
        super.replace(i13, i14, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c13) {
        super.append(c13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i13, CharSequence charSequence, int i14, int i15) {
        super.insert(i13, charSequence, i14, i15);
        return this;
    }

    public f0(Class cls, CharSequence charSequence, int i13, int i14) {
        super(charSequence, i13, i14);
        this.f67712b = new ArrayList();
        com.bumptech.glide.d.s(cls, "watcherClass cannot be null");
        this.f67711a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c13) {
        super.append(c13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c13) {
        super.append(c13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i13, int i14, CharSequence charSequence, int i15, int i16) {
        a();
        super.replace(i13, i14, charSequence, i15, i16);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i13, int i14) {
        super.append(charSequence, i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i13, int i14) {
        super.append(charSequence, i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i13, int i14) {
        super.append(charSequence, i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i13) {
        super.append(charSequence, obj, i13);
        return this;
    }
}
