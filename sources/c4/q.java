package c4;

import android.os.Build;
import android.text.StaticLayout;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class q implements v {
    @Override // c4.v
    @NotNull
    public StaticLayout a(@NotNull w wVar) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(wVar.f25661a, wVar.f25662b, wVar.f25663c, wVar.f25664d, wVar.f25665e);
        obtain.setTextDirection(wVar.f25666f);
        obtain.setAlignment(wVar.f25667g);
        obtain.setMaxLines(wVar.f25668h);
        obtain.setEllipsize(wVar.f25669i);
        obtain.setEllipsizedWidth(wVar.f25670j);
        obtain.setLineSpacing(wVar.f25672l, wVar.f25671k);
        obtain.setIncludePad(wVar.f25674n);
        obtain.setBreakStrategy(wVar.f25676p);
        obtain.setHyphenationFrequency(wVar.f25679s);
        obtain.setIndents(wVar.f25680t, wVar.f25681u);
        int i13 = Build.VERSION.SDK_INT;
        r.a(obtain, wVar.f25673m);
        if (i13 >= 28) {
            s.a(obtain, wVar.f25675o);
        }
        if (i13 >= 33) {
            t.b(obtain, wVar.f25677q, wVar.f25678r);
        }
        return obtain.build();
    }
}
