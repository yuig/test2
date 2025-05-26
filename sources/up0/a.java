package up0;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.pinterest.activity.pin.view.unifiedcomments.NewCommentTextEdit;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rh1.s1;

/* loaded from: classes5.dex */
public final class a implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f122939a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f122940b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f122941c;

    public a(NewCommentTextEdit inputText, s1 deleteHandler) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(deleteHandler, "deleteHandler");
        this.f122939a = inputText;
        this.f122940b = deleteHandler;
        this.f122941c = new ArrayList();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable text) {
        Intrinsics.checkNotNullParameter(text, "text");
        EditText editText = this.f122939a;
        editText.removeTextChangedListener(this);
        ArrayList arrayList = this.f122941c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (text.length() != 0) {
                int min = Math.min(text.length(), cVar.f122944c);
                int length = text.length();
                int i13 = cVar.f122943b;
                if (i13 < length) {
                    if (Intrinsics.d(text.subSequence(i13, min).toString(), cVar.f122942a)) {
                        text.setSpan(cVar.f122945d, i13, cVar.f122944c, 33);
                    } else {
                        text.delete(i13, min);
                        this.f122940b.invoke();
                    }
                }
            }
        }
        arrayList.clear();
        editText.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence text, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(text, "text");
        int i16 = i14 + i13;
        Editable editableText = this.f122939a.getEditableText();
        me0.a[] aVarArr = (me0.a[]) editableText.getSpans(i13, i16, me0.a.class);
        Intrinsics.f(aVarArr);
        for (me0.a aVar : aVarArr) {
            int spanStart = editableText.getSpanStart(aVar);
            int spanEnd = editableText.getSpanEnd(aVar);
            if (spanStart < i16 && spanEnd > i13) {
                ArrayList arrayList = this.f122941c;
                String obj = editableText.subSequence(spanStart, spanEnd).toString();
                Intrinsics.f(aVar);
                arrayList.add(new c(obj, spanStart, spanEnd, aVar));
                editableText.removeSpan(aVar);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence text, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(text, "text");
    }
}
