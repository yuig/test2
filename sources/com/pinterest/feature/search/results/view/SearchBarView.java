package com.pinterest.feature.search.results.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.design.brio.widget.PinterestEditText;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.u0;
import m60.r0;

/* loaded from: classes5.dex */
public class SearchBarView extends LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f47683m = 0;

    /* renamed from: a, reason: collision with root package name */
    public ImageView f47684a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f47685b;

    /* renamed from: c, reason: collision with root package name */
    public PinterestEditText f47686c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f47687d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f47688e;

    /* renamed from: f, reason: collision with root package name */
    public View f47689f;

    /* renamed from: g, reason: collision with root package name */
    public j f47690g;

    /* renamed from: h, reason: collision with root package name */
    public String f47691h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f47692i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f47693j;

    /* renamed from: k, reason: collision with root package name */
    public q71.t f47694k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f47695l;

    public SearchBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47691h = "";
        this.f47692i = true;
        this.f47693j = true;
        this.f47695l = false;
        a(context, attributeSet, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i13) {
        Resources resources = getResources();
        final int i14 = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, i42.d.SearchBarView, i13, 0);
        try {
            String string = obtainStyledAttributes.getString(i42.d.SearchBarView_hintText);
            final int i15 = 1;
            boolean z13 = obtainStyledAttributes.getBoolean(i42.d.SearchBarView_showSearchIcon, true);
            boolean z14 = obtainStyledAttributes.getBoolean(i42.d.SearchBarView_typeable, true);
            this.f47693j = obtainStyledAttributes.getBoolean(i42.d.SearchBarView_focusQuery, this.f47693j);
            int i16 = obtainStyledAttributes.getInt(i42.d.SearchBarView_textSize, eo1.c.font_size_300);
            if (string == null) {
                string = context.getString(i42.c.search_view_hint);
            }
            View.inflate(context, i42.b.view_search_bar, this);
            this.f47684a = (ImageView) findViewById(i42.a.view_search_bar_search_icon);
            this.f47686c = (PinterestEditText) findViewById(i.f.search_src_text);
            this.f47687d = (ImageView) findViewById(i.f.search_close_btn);
            this.f47688e = (ImageView) findViewById(i42.a.view_search_bar_lens);
            this.f47689f = findViewById(i42.a.view_search_bar_focus_grabber);
            this.f47685b = (ImageView) findViewById(i42.a.view_search_bar_microphone);
            this.f47687d.setOnClickListener(new View.OnClickListener(this) { // from class: com.pinterest.feature.search.results.view.k

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SearchBarView f47810b;

                {
                    this.f47810b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i17 = i14;
                    SearchBarView searchBarView = this.f47810b;
                    switch (i17) {
                        case 0:
                            searchBarView.f47686c.requestFocus();
                            searchBarView.f47686c.selectAll();
                            new BaseInputConnection(searchBarView.f47686c, true).sendKeyEvent(new KeyEvent(0, 67));
                            break;
                        case 1:
                            j jVar = searchBarView.f47690g;
                            if (jVar != null) {
                                jVar.l();
                                break;
                            }
                            break;
                        default:
                            if (searchBarView.f47694k != null) {
                                searchBarView.f47686c.setText("");
                                try {
                                    searchBarView.f47686c.setSelection(0);
                                } catch (IndexOutOfBoundsException unused) {
                                }
                                searchBarView.c(false);
                                q71.x xVar = searchBarView.f47694k.f102763a;
                                xVar.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.SEARCH_BOX_VOICE_INPUT, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                                xVar.X8();
                                break;
                            }
                            break;
                    }
                }
            });
            this.f47688e.setOnClickListener(new View.OnClickListener(this) { // from class: com.pinterest.feature.search.results.view.k

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SearchBarView f47810b;

                {
                    this.f47810b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i17 = i15;
                    SearchBarView searchBarView = this.f47810b;
                    switch (i17) {
                        case 0:
                            searchBarView.f47686c.requestFocus();
                            searchBarView.f47686c.selectAll();
                            new BaseInputConnection(searchBarView.f47686c, true).sendKeyEvent(new KeyEvent(0, 67));
                            break;
                        case 1:
                            j jVar = searchBarView.f47690g;
                            if (jVar != null) {
                                jVar.l();
                                break;
                            }
                            break;
                        default:
                            if (searchBarView.f47694k != null) {
                                searchBarView.f47686c.setText("");
                                try {
                                    searchBarView.f47686c.setSelection(0);
                                } catch (IndexOutOfBoundsException unused) {
                                }
                                searchBarView.c(false);
                                q71.x xVar = searchBarView.f47694k.f102763a;
                                xVar.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.SEARCH_BOX_VOICE_INPUT, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                                xVar.X8();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i17 = 2;
            this.f47685b.setOnClickListener(new View.OnClickListener(this) { // from class: com.pinterest.feature.search.results.view.k

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SearchBarView f47810b;

                {
                    this.f47810b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i172 = i17;
                    SearchBarView searchBarView = this.f47810b;
                    switch (i172) {
                        case 0:
                            searchBarView.f47686c.requestFocus();
                            searchBarView.f47686c.selectAll();
                            new BaseInputConnection(searchBarView.f47686c, true).sendKeyEvent(new KeyEvent(0, 67));
                            break;
                        case 1:
                            j jVar = searchBarView.f47690g;
                            if (jVar != null) {
                                jVar.l();
                                break;
                            }
                            break;
                        default:
                            if (searchBarView.f47694k != null) {
                                searchBarView.f47686c.setText("");
                                try {
                                    searchBarView.f47686c.setSelection(0);
                                } catch (IndexOutOfBoundsException unused) {
                                }
                                searchBarView.c(false);
                                q71.x xVar = searchBarView.f47694k.f102763a;
                                xVar.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.SEARCH_BOX_VOICE_INPUT, (r18 & 4) != 0 ? null : h32.g0.SEARCH_BOX, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                                xVar.X8();
                                break;
                            }
                            break;
                    }
                }
            });
            this.f47686c.setOnFocusChangeListener(new com.google.android.material.datepicker.h(this, 6));
            this.f47686c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.pinterest.feature.search.results.view.l
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                    int i19 = SearchBarView.f47683m;
                    SearchBarView searchBarView = SearchBarView.this;
                    searchBarView.getClass();
                    if (i18 != 3 && i18 != 6 && keyEvent != null && keyEvent.getKeyCode() != 66) {
                        return false;
                    }
                    searchBarView.b(false);
                    String p13 = pk.a0.p1(searchBarView.f47686c.getText().toString());
                    j jVar = searchBarView.f47690g;
                    if (jVar != null) {
                        jVar.E0(p13);
                    }
                    return true;
                }
            });
            this.f47686c.addTextChangedListener(new com.google.android.material.search.e(this, 3));
            if (i16 != 0) {
                this.f47686c.setTextSize(0, resources.getDimension(i16));
            }
            this.f47686c.setHint(string);
            this.f47686c.setEnabled(z14);
            c(z13);
            setBackgroundResource(ga2.c.lego_search_bar_background);
            setMinimumHeight(getResources().getDimensionPixelSize(r0.search_textview_height));
            setLayoutTransition(new LayoutTransition());
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.stroke);
            setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            post(new vs0.b(this, 23));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void b(boolean z13) {
        if (z13) {
            this.f47686c.requestFocus();
        } else {
            this.f47689f.requestFocus();
        }
    }

    public final void c(boolean z13) {
        this.f47684a.setVisibility(z13 ? 0 : 8);
        if (this.f47695l) {
            this.f47685b.setVisibility(z13 ^ true ? 0 : 8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || !this.f47686c.hasFocus()) {
            return false;
        }
        b(false);
        return true;
    }

    public SearchBarView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f47691h = "";
        this.f47692i = true;
        this.f47693j = true;
        this.f47695l = false;
        a(context, attributeSet, i13);
    }
}
