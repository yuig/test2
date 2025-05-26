package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m2 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f46246a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f46247b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f46248c;

    /* renamed from: d, reason: collision with root package name */
    public float f46249d;

    /* renamed from: e, reason: collision with root package name */
    public float f46250e;

    /* renamed from: f, reason: collision with root package name */
    public float f46251f;

    /* renamed from: g, reason: collision with root package name */
    public final float f46252g;

    /* renamed from: h, reason: collision with root package name */
    public final float f46253h;

    public m2(Context context, EditText editTextView, au0.f textChangeCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(editTextView, "editTextView");
        Intrinsics.checkNotNullParameter(textChangeCallback, "textChangeCallback");
        this.f46246a = context;
        this.f46247b = editTextView;
        this.f46248c = textChangeCallback;
        this.f46250e = 1.0f;
        this.f46251f = 1.0f;
        float f13 = 36;
        this.f46252g = 10.0f / f13;
        this.f46253h = 100.0f / f13;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent != null) {
            EditText editText = this.f46247b;
            if (view != null && (view instanceof EditText)) {
                editText.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction() & 255;
            if (action != 2) {
                if (action == 5) {
                    this.f46249d = ph.a.y(motionEvent);
                    this.f46250e = this.f46251f;
                } else if (action == 6) {
                    this.f46248c.invoke(Float.valueOf(ig1.b.f1(editText.getTextSize(), this.f46246a)));
                    nx.d0 a13 = sh.f.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                    nx.d0.B(a13, h32.f1.STORY_PIN_FONT_SIZE_CHANGE, null, null, null, 30);
                }
            } else if (motionEvent.getPointerCount() == 2) {
                float min = Math.min(this.f46253h, Math.max(this.f46252g, this.f46250e * ((float) Math.pow(2.0f, (ph.a.y(motionEvent) - this.f46249d) / 100))));
                this.f46251f = min;
                editText.setTextSize(min * 36);
                float textSize = editText.getTextSize() / 5;
                kg.p.Y(editText, textSize);
                String obj = editText.getText().toString();
                uf1.b[] bVarArr = (uf1.b[]) editText.getText().getSpans(0, obj.length(), uf1.b.class);
                Intrinsics.f(bVarArr);
                if (!(bVarArr.length == 0)) {
                    uf1.b bVar = bVarArr[0];
                    uf1.b bVar2 = new uf1.b(this.f46246a, bVar.f122098a, bVar.f122099b, textSize, textSize);
                    SpannableString spannableString = new SpannableString(obj);
                    spannableString.setSpan(bVar2, 0, obj.length(), 18);
                    editText.setText(spannableString);
                }
            }
        }
        return true;
    }
}
