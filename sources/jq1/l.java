package jq1;

import android.graphics.Typeface;
import android.view.View;
import c72.c0;
import do2.t2;
import do2.u2;
import do2.y1;
import g4.u;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import r72.k2;

/* loaded from: classes5.dex */
public final class l extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77495i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f77496j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f77497k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13, Object obj, Object obj2) {
        super(2);
        this.f77495i = i13;
        this.f77496j = obj;
        this.f77497k = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Typeface createFromFile;
        int i13 = this.f77495i;
        int i14 = 0;
        Object obj3 = this.f77497k;
        Object obj4 = this.f77496j;
        switch (i13) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter((View) obj, "<anonymous parameter 0>");
                n nVar = (n) obj4;
                nVar.getClass();
                if (intValue < hf0.b.f69004d && !nVar.E9()) {
                    i14 = bs1.c.W((View) obj3, eo1.c.lego_spacing_vertical_xlarge);
                }
                return Integer.valueOf(i14);
            case 1:
                ((ByteBuffer) obj4).get(((it1.a) obj3).f73674a, ((Number) obj).intValue(), ((Number) obj2).intValue());
                return Unit.f80348a;
            case 2:
                k2 fontType = (k2) obj;
                int intValue2 = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(fontType, "fontType");
                h72.l lVar = (h72.l) obj4;
                File file = (File) obj3;
                lVar.getClass();
                String key = fontType.name();
                c0 c0Var = lVar.f67989d;
                c0Var.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(key, "key");
                LinkedHashMap linkedHashMap = c0Var.f26893a;
                Object obj5 = linkedHashMap.get(key);
                if (obj5 == null) {
                    Typeface DEFAULT = Typeface.DEFAULT;
                    Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
                    obj5 = u2.a(DEFAULT);
                    linkedHashMap.put(key, obj5);
                }
                if (!(!Intrinsics.d((Typeface) ((t2) ((y1) obj5)).getValue(), Typeface.DEFAULT))) {
                    u uVar = lVar.f67993h;
                    n72.m mVar = lVar.f67992g;
                    try {
                        try {
                            if (intValue2 != 0) {
                                createFromFile = new Typeface.Builder(file).setFontVariationSettings("'wght' " + intValue2).setWeight(intValue2).build();
                            } else {
                                createFromFile = Typeface.createFromFile(file);
                            }
                            String name = fontType.name();
                            Intrinsics.f(createFromFile);
                            c0Var.a(createFromFile, name);
                        } catch (IndexOutOfBoundsException unused) {
                            file.delete();
                            String exceptionName = "Font IndexOutOfBounds: Type: " + fontType.name() + " - Weight: " + intValue2;
                            uVar.getClass();
                            Intrinsics.checkNotNullParameter(exceptionName, "exceptionName");
                            r1 = false;
                        } catch (RuntimeException e13) {
                            String message = e13.getMessage();
                            if (message == null || !StringsKt.E(message, "Font not found", false)) {
                                mVar.d(e13, h72.d.f67961o);
                                r1 = false;
                            } else {
                                String exceptionName2 = "Font not found in file - " + file.getName();
                                uVar.getClass();
                                Intrinsics.checkNotNullParameter(exceptionName2, "exceptionName");
                            }
                        } catch (Exception e14) {
                            mVar.d(e14, h72.d.f67962p);
                            r1 = false;
                        }
                    } catch (Exception e15) {
                        mVar.d(e15, h72.d.f67960n);
                        String exceptionName3 = "Font IndexOutOfBounds: Type: " + fontType.name() + " - Weight: " + intValue2;
                        uVar.getClass();
                        Intrinsics.checkNotNullParameter(exceptionName3, "exceptionName");
                        r1 = false;
                        return Boolean.valueOf(r1);
                    }
                }
                return Boolean.valueOf(r1);
            default:
                return Boolean.valueOf(Intrinsics.d((am2.m) obj, (am2.b) obj4) && Intrinsics.d((am2.m) obj2, (am2.b) obj3));
        }
    }
}
