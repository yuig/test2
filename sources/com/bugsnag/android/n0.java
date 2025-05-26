package com.bugsnag.android;

import android.util.JsonReader;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class n0 extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29352a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Object obj, int i13) {
        super(1, obj, l0.class, "fromReader", "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/DeviceId;", 0);
        this.f29352a = i13;
        if (i13 != 1) {
        } else {
            super(1, obj, z3.class, "fromReader", "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/User;", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = null;
        switch (this.f29352a) {
            case 0:
                JsonReader jsonReader = (JsonReader) obj;
                ((l0) this.receiver).getClass();
                jsonReader.beginObject();
                if (jsonReader.hasNext() && Intrinsics.d("id", jsonReader.nextName())) {
                    str = jsonReader.nextString();
                }
                return new m0(str);
            default:
                JsonReader jsonReader2 = (JsonReader) obj;
                ((z3) this.receiver).getClass();
                jsonReader2.beginObject();
                String str2 = null;
                String str3 = null;
                while (jsonReader2.hasNext()) {
                    String nextName = jsonReader2.nextName();
                    String nextString = jsonReader2.nextString();
                    if (nextName != null) {
                        int hashCode = nextName.hashCode();
                        if (hashCode != 3355) {
                            if (hashCode != 3373707) {
                                if (hashCode == 96619420 && nextName.equals("email")) {
                                    str2 = nextString;
                                }
                            } else if (nextName.equals("name")) {
                                str3 = nextString;
                            }
                        } else if (nextName.equals("id")) {
                            str = nextString;
                        }
                    }
                }
                a4 a4Var = new a4(str, str2, str3);
                jsonReader2.endObject();
                return a4Var;
        }
    }
}
