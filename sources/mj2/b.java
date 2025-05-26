package mj2;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.logging.Logger;
import kh2.p2;
import ri2.e;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        e eVar = (e) obj;
        Logger logger = a.f87279c;
        boolean z13 = false;
        if (!eVar.f108404b.isEmpty()) {
            String str = eVar.f108404b;
            if (str.length() <= 255) {
                int i13 = 0;
                while (true) {
                    if (i13 >= str.length()) {
                        z13 = true;
                        break;
                    }
                    char charAt = str.charAt(i13);
                    if (charAt < ' ' || charAt > '~') {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        p2.T("Attribute key should be a ASCII string with a length greater than 0 and not exceed 255 characters.", z13);
        Objects.requireNonNull(obj2, "Attribute value should be a ASCII string with a length not exceed 255 characters.");
    }
}
