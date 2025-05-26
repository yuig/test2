package xa;

import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class d extends SingleLineTransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public Locale f134379a;

    @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        CharSequence transformation = super.getTransformation(charSequence, view);
        if (transformation != null) {
            return transformation.toString().toUpperCase(this.f134379a);
        }
        return null;
    }
}
