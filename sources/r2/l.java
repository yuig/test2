package r2;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    public final /* synthetic */ m f106053a;

    /* renamed from: b */
    public final /* synthetic */ String f106054b;

    /* renamed from: c */
    public final /* synthetic */ Function0 f106055c;

    public l(m mVar, String str, Function0 function0) {
        this.f106053a = mVar;
        this.f106054b = str;
        this.f106055c = function0;
    }

    public final void a() {
        m mVar = this.f106053a;
        LinkedHashMap linkedHashMap = mVar.f106058c;
        String str = this.f106054b;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove(this.f106055c);
        }
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        mVar.f106058c.put(str, list);
    }
}
