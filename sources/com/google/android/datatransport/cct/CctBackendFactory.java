package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import mg.a;
import mg.b;
import mg.g;

@Keep
/* loaded from: classes3.dex */
public class CctBackendFactory {
    public g create(b bVar) {
        a aVar = (a) bVar;
        Context context = aVar.f87132a;
        tg.a aVar2 = aVar.f87133b;
        return new jg.b(context);
    }
}
