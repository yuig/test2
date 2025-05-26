package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class SearchView extends LinearLayoutCompat implements m.d {
    public static final r2 S;
    public final Rect A;
    public final int[] B;
    public final int[] C;
    public final ImageView D;
    public final Drawable E;
    public final CharSequence F;
    public q2 G;
    public View.OnFocusChangeListener H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f16424J;
    public CharSequence K;
    public boolean L;
    public final int M;
    public String N;
    public boolean O;
    public int P;
    public final i2 Q;
    public final i2 R;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f16425p;

    /* renamed from: q, reason: collision with root package name */
    public final View f16426q;

    /* renamed from: r, reason: collision with root package name */
    public final View f16427r;

    /* renamed from: s, reason: collision with root package name */
    public final View f16428s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f16429t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f16430u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f16431v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f16432w;

    /* renamed from: x, reason: collision with root package name */
    public final View f16433x;

    /* renamed from: y, reason: collision with root package name */
    public u2 f16434y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f16435z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new s2();

        /* renamed from: c, reason: collision with root package name */
        public boolean f16436c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16436c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("SearchView.SavedState{");
            sb3.append(Integer.toHexString(System.identityHashCode(this)));
            sb3.append(" isIconified=");
            return a.a.r(sb3, this.f16436c, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeValue(Boolean.valueOf(this.f16436c));
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: e, reason: collision with root package name */
        public int f16437e;

        /* renamed from: f, reason: collision with root package name */
        public SearchView f16438f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f16439g;

        /* renamed from: h, reason: collision with root package name */
        public final t2 f16440h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, i.a.autoCompleteTextViewStyle);
        }

        public final void a(boolean z13) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            t2 t2Var = this.f16440h;
            if (!z13) {
                this.f16439g = false;
                removeCallbacks(t2Var);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f16439g = true;
                    return;
                }
                this.f16439g = false;
                removeCallbacks(t2Var);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f16437e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f16439g) {
                t2 t2Var = this.f16440h;
                removeCallbacks(t2Var);
                post(t2Var);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i13 = configuration.screenWidthDp;
            int i14 = configuration.screenHeightDp;
            setMinWidth((int) TypedValue.applyDimension(1, (i13 < 960 || i14 < 720 || configuration.orientation != 2) ? (i13 >= 600 || (i13 >= 640 && i14 >= 480)) ? RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY : 160 : RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, displayMetrics));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z13, int i13, Rect rect) {
            super.onFocusChanged(z13, i13, rect);
            SearchView searchView = this.f16438f;
            searchView.A(searchView.f16424J);
            searchView.post(searchView.Q);
            if (searchView.f16425p.hasFocus()) {
                searchView.t();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i13, KeyEvent keyEvent) {
            if (i13 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f16438f.clearFocus();
                        a(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i13, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z13) {
            super.onWindowFocusChanged(z13);
            if (z13 && this.f16438f.hasFocus() && getVisibility() == 0) {
                this.f16439g = true;
                Context context = getContext();
                r2 r2Var = SearchView.S;
                if (context.getResources().getConfiguration().orientation == 2) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        p2.b(this, 1);
                        if (enoughToFilter()) {
                            showDropDown();
                            return;
                        }
                        return;
                    }
                    r2 r2Var2 = SearchView.S;
                    r2Var2.getClass();
                    r2.a();
                    Method method = r2Var2.f16679c;
                    if (method != null) {
                        try {
                            method.invoke(this, Boolean.TRUE);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void setThreshold(int i13) {
            super.setThreshold(i13);
            this.f16437e = i13;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i13) {
            super(context, attributeSet, i13);
            this.f16440h = new t2(this);
            this.f16437e = getThreshold();
        }
    }

    static {
        r2 r2Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            r2 r2Var2 = new r2();
            r2Var2.f16677a = null;
            r2Var2.f16678b = null;
            r2Var2.f16679c = null;
            r2.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                r2Var2.f16677a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                r2Var2.f16678b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                r2Var2.f16679c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            r2Var = r2Var2;
        }
        S = r2Var;
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.searchViewStyle);
    }

    public final void A(boolean z13) {
        this.f16424J = z13;
        int i13 = z13 ? 0 : 8;
        TextUtils.isEmpty(this.f16425p.getText());
        this.f16429t.setVisibility(i13);
        this.f16430u.setVisibility(8);
        this.f16426q.setVisibility(z13 ? 8 : 0);
        ImageView imageView = this.D;
        imageView.setVisibility((imageView.getDrawable() == null || this.I) ? 8 : 0);
        x();
        this.f16432w.setVisibility(8);
        this.f16428s.setVisibility(8);
    }

    @Override // m.d
    public final void c() {
        if (this.O) {
            return;
        }
        this.O = true;
        SearchAutoComplete searchAutoComplete = this.f16425p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.P = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        A(false);
        searchAutoComplete.requestFocus();
        searchAutoComplete.a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.L = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f16425p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.a(false);
        this.L = false;
    }

    @Override // m.d
    public final void d() {
        w("", false);
        clearFocus();
        A(true);
        this.f16425p.setImeOptions(this.P);
        this.O = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.Q);
        post(this.R);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        if (z13) {
            int[] iArr = this.B;
            SearchAutoComplete searchAutoComplete = this.f16425p;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.C;
            getLocationInWindow(iArr2);
            int i17 = iArr[1] - iArr2[1];
            int i18 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i18;
            int height = searchAutoComplete.getHeight() + i17;
            Rect rect = this.f16435z;
            rect.set(i18, i17, width, height);
            int i19 = rect.left;
            int i23 = rect.right;
            int i24 = i16 - i14;
            Rect rect2 = this.A;
            rect2.set(i19, 0, i23, i24);
            u2 u2Var = this.f16434y;
            if (u2Var == null) {
                u2 u2Var2 = new u2(searchAutoComplete, rect2, rect);
                this.f16434y = u2Var2;
                setTouchDelegate(u2Var2);
            } else {
                u2Var.f16689b.set(rect2);
                Rect rect3 = u2Var.f16691d;
                rect3.set(rect2);
                int i25 = -u2Var.f16692e;
                rect3.inset(i25, i25);
                u2Var.f16690c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        if (this.f16424J) {
            super.onMeasure(i13, i14);
            return;
        }
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        if (mode == Integer.MIN_VALUE) {
            int i16 = this.M;
            size = i16 > 0 ? Math.min(i16, size) : Math.min(getContext().getResources().getDimensionPixelSize(i.d.abc_search_view_preferred_width), size);
        } else if (mode == 0) {
            size = this.M;
            if (size <= 0) {
                size = getContext().getResources().getDimensionPixelSize(i.d.abc_search_view_preferred_width);
            }
        } else if (mode == 1073741824 && (i15 = this.M) > 0) {
            size = Math.min(i15, size);
        }
        int mode2 = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i14);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getContext().getResources().getDimensionPixelSize(i.d.abc_search_view_preferred_height), size2);
        } else if (mode2 == 0) {
            size2 = getContext().getResources().getDimensionPixelSize(i.d.abc_search_view_preferred_height);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f18020a);
        A(savedState.f16436c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f16436c = this.f16424J;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z13) {
        super.onWindowFocusChanged(z13);
        post(this.Q);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i13, Rect rect) {
        if (this.L || !isFocusable()) {
            return false;
        }
        if (this.f16424J) {
            return super.requestFocus(i13, rect);
        }
        boolean requestFocus = this.f16425p.requestFocus(i13, rect);
        if (requestFocus) {
            A(false);
        }
        return requestFocus;
    }

    public final void t() {
        int i13 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f16425p;
        if (i13 >= 29) {
            p2.a(searchAutoComplete);
            return;
        }
        r2 r2Var = S;
        r2Var.getClass();
        r2.a();
        Method method = r2Var.f16677a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        r2Var.getClass();
        r2.a();
        Method method2 = r2Var.f16678b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void u() {
        SearchAutoComplete searchAutoComplete = this.f16425p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.a(true);
        } else if (this.I) {
            clearFocus();
            A(true);
        }
    }

    public final void v() {
        SearchAutoComplete searchAutoComplete = this.f16425p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        q2 q2Var = this.G;
        if (q2Var == null || !q2Var.b(text.toString())) {
            searchAutoComplete.a(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void w(CharSequence charSequence, boolean z13) {
        SearchAutoComplete searchAutoComplete = this.f16425p;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
        }
        if (!z13 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        v();
    }

    public final void x() {
        boolean z13 = true;
        boolean z14 = !TextUtils.isEmpty(this.f16425p.getText());
        if (!z14 && (!this.I || this.O)) {
            z13 = false;
        }
        int i13 = z13 ? 0 : 8;
        ImageView imageView = this.f16431v;
        imageView.setVisibility(i13);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z14 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void y() {
        int[] iArr = this.f16425p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f16427r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f16428s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void z() {
        Drawable drawable;
        CharSequence charSequence = this.K;
        if (charSequence == null) {
            charSequence = this.F;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z13 = this.I;
        SearchAutoComplete searchAutoComplete = this.f16425p;
        if (z13 && (drawable = this.E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence = spannableStringBuilder;
        }
        searchAutoComplete.setHint(charSequence);
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f16435z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.Q = new i2(this, 0);
        this.R = new i2(this, 1);
        new WeakHashMap();
        l2 l2Var = new l2(this);
        m2 m2Var = new m2(this);
        n2 n2Var = new n2(this);
        o2 o2Var = new o2(this);
        n1 n1Var = new n1(this, 1);
        h2 h2Var = new h2(this);
        x92.b N = x92.b.N(context, attributeSet, i.j.SearchView, i13, 0);
        q5.v0.n(this, context, i.j.SearchView, attributeSet, (TypedArray) N.f134366c, i13, 0);
        LayoutInflater.from(context).inflate(N.C(i.j.SearchView_layout, i.g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(i.f.search_src_text);
        this.f16425p = searchAutoComplete;
        searchAutoComplete.f16438f = this;
        this.f16426q = findViewById(i.f.search_edit_frame);
        View findViewById = findViewById(i.f.search_plate);
        this.f16427r = findViewById;
        View findViewById2 = findViewById(i.f.submit_area);
        this.f16428s = findViewById2;
        ImageView imageView = (ImageView) findViewById(i.f.search_button);
        this.f16429t = imageView;
        ImageView imageView2 = (ImageView) findViewById(i.f.search_go_btn);
        this.f16430u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(i.f.search_close_btn);
        this.f16431v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(i.f.search_voice_btn);
        this.f16432w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(i.f.search_mag_icon);
        this.D = imageView5;
        findViewById.setBackground(N.x(i.j.SearchView_queryBackground));
        findViewById2.setBackground(N.x(i.j.SearchView_submitBackground));
        imageView.setImageDrawable(N.x(i.j.SearchView_searchIcon));
        imageView2.setImageDrawable(N.x(i.j.SearchView_goIcon));
        imageView3.setImageDrawable(N.x(i.j.SearchView_closeIcon));
        imageView4.setImageDrawable(N.x(i.j.SearchView_voiceIcon));
        imageView5.setImageDrawable(N.x(i.j.SearchView_searchIcon));
        this.E = N.x(i.j.SearchView_searchHintIcon);
        i3.a(imageView, getResources().getString(i.h.abc_searchview_description_search));
        N.C(i.j.SearchView_suggestionRowLayout, i.g.abc_search_dropdown_item_icons_2line);
        N.C(i.j.SearchView_commitIcon, 0);
        imageView.setOnClickListener(l2Var);
        imageView3.setOnClickListener(l2Var);
        imageView2.setOnClickListener(l2Var);
        imageView4.setOnClickListener(l2Var);
        searchAutoComplete.setOnClickListener(l2Var);
        searchAutoComplete.addTextChangedListener(h2Var);
        searchAutoComplete.setOnEditorActionListener(n2Var);
        searchAutoComplete.setOnItemClickListener(o2Var);
        searchAutoComplete.setOnItemSelectedListener(n1Var);
        searchAutoComplete.setOnKeyListener(m2Var);
        searchAutoComplete.setOnFocusChangeListener(new j2(this));
        boolean t13 = N.t(i.j.SearchView_iconifiedByDefault, true);
        if (this.I != t13) {
            this.I = t13;
            A(t13);
            z();
        }
        int w13 = N.w(i.j.SearchView_android_maxWidth, -1);
        if (w13 != -1) {
            this.M = w13;
            requestLayout();
        }
        this.F = N.E(i.j.SearchView_defaultQueryHint);
        this.K = N.E(i.j.SearchView_queryHint);
        int B = N.B(i.j.SearchView_android_imeOptions, -1);
        if (B != -1) {
            searchAutoComplete.setImeOptions(B);
        }
        int B2 = N.B(i.j.SearchView_android_inputType, -1);
        if (B2 != -1) {
            searchAutoComplete.setInputType(B2);
        }
        setFocusable(N.t(i.j.SearchView_android_focusable, true));
        N.O();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        new Intent("android.speech.action.RECOGNIZE_SPEECH").addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f16433x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new k2(this));
        }
        A(this.I);
        z();
    }
}
