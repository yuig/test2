package nt0;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.pinterest.api.model.zq;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import go0.r;
import h22.f;
import il2.k;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kt0.x;
import lq0.g1;
import n60.o;
import tb0.h;
import tk2.e;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f92289a;

    /* renamed from: b, reason: collision with root package name */
    public final f f92290b;

    /* renamed from: c, reason: collision with root package name */
    public final h f92291c;

    public d(Context context, f ideaPinService, h crashReporting) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ideaPinService, "ideaPinService");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f92289a = context;
        this.f92290b = ideaPinService;
        this.f92291c = crashReporting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList c(File file) {
        Bitmap bitmap;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        int i18;
        Bitmap bitmap2;
        Bitmap bitmap3;
        byte[] bArr;
        ArrayList arrayList = new ArrayList();
        b bVar = new b();
        bVar.f92272l = new byte[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        int i19 = 0;
        bVar.f92273m = 0;
        if (file != null) {
            byte[] a13 = k.a(file);
            bVar.f92261a = 0;
            bVar.f92285y = 0;
            bVar.f92284x = -1;
            bVar.f92280t = new ArrayList();
            Bitmap bitmap4 = null;
            bVar.f92266f = null;
            int i23 = 1;
            int i24 = 2;
            if (a13 != null) {
                ByteBuffer wrap = ByteBuffer.wrap(a13);
                bVar.f92271k = wrap;
                wrap.rewind();
                bVar.f92271k.order(ByteOrder.LITTLE_ENDIAN);
                String str = "";
                for (int i25 = 0; i25 < 6; i25++) {
                    StringBuilder i26 = o.i(str);
                    i26.append((char) bVar.c());
                    str = i26.toString();
                }
                if (str.startsWith("GIF")) {
                    bVar.f92262b = bVar.f92271k.getShort();
                    bVar.f92263c = bVar.f92271k.getShort();
                    int c13 = bVar.c();
                    bVar.f92264d = (c13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0;
                    bVar.f92265e = 2 << (c13 & 7);
                    bVar.f92268h = bVar.c();
                    bVar.c();
                    int i27 = bVar.f92262b;
                    int i28 = bVar.f92263c;
                    int i29 = i27 * i28;
                    bVar.f92277q = new byte[i29];
                    bVar.f92278r = new int[i29];
                    bVar.f92279s = new int[i29];
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    bVar.f92282v = Bitmap.createBitmap(i27, i28, config);
                    bVar.f92283w = Bitmap.createBitmap(bVar.f92262b, bVar.f92263c, config);
                    if (bVar.f92264d && !bVar.b()) {
                        int[] e13 = bVar.e(bVar.f92265e);
                        bVar.f92266f = e13;
                        bVar.f92269i = e13[bVar.f92268h];
                    }
                } else {
                    bVar.f92261a = 1;
                }
                if (!bVar.b()) {
                    boolean z13 = false;
                    while (!z13 && !bVar.b()) {
                        int c14 = bVar.c();
                        if (c14 == 33) {
                            int c15 = bVar.c();
                            if (c15 == 1) {
                                bVar.f();
                            } else if (c15 == 249) {
                                bVar.f92281u = new a();
                                bVar.c();
                                int c16 = bVar.c();
                                a aVar = bVar.f92281u;
                                int i33 = (c16 & 28) >> 2;
                                aVar.f92256g = i33;
                                if (i33 == 0) {
                                    aVar.f92256g = 1;
                                }
                                aVar.f92255f = (c16 & 1) != 0;
                                aVar.f92258i = bVar.f92271k.getShort() * 10;
                                bVar.f92281u.f92257h = bVar.c();
                                bVar.c();
                            } else if (c15 == 254) {
                                bVar.f();
                            } else if (c15 != 255) {
                                bVar.f();
                            } else {
                                bVar.d();
                                int i34 = 0;
                                String str2 = "";
                                while (true) {
                                    bArr = bVar.f92272l;
                                    if (i34 >= 11) {
                                        break;
                                    }
                                    StringBuilder i35 = o.i(str2);
                                    i35.append((char) bArr[i34]);
                                    str2 = i35.toString();
                                    i34++;
                                }
                                if ("NETSCAPE2.0".equals(str2)) {
                                    do {
                                        bVar.d();
                                        if (bArr[0] == 1) {
                                            byte b13 = bArr[1];
                                            byte b14 = bArr[2];
                                        }
                                        if (bVar.f92273m > 0) {
                                        }
                                    } while (!bVar.b());
                                } else {
                                    bVar.f();
                                }
                            }
                        } else if (c14 == 44) {
                            bVar.f92281u.f92250a = bVar.f92271k.getShort();
                            bVar.f92281u.f92251b = bVar.f92271k.getShort();
                            bVar.f92281u.f92252c = bVar.f92271k.getShort();
                            bVar.f92281u.f92253d = bVar.f92271k.getShort();
                            int c17 = bVar.c();
                            bVar.f92270j = (c17 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0;
                            int pow = (int) Math.pow(2.0d, (c17 & 7) + 1);
                            a aVar2 = bVar.f92281u;
                            aVar2.f92254e = (c17 & 64) != 0;
                            if (bVar.f92270j) {
                                aVar2.f92260k = bVar.e(pow);
                            } else {
                                aVar2.f92260k = null;
                            }
                            bVar.f92281u.f92259j = bVar.f92271k.position();
                            bVar.a(null, bVar.f92277q);
                            bVar.f();
                            if (!bVar.b()) {
                                bVar.f92285y++;
                                bVar.f92280t.add(bVar.f92281u);
                            }
                        } else if (c14 != 59) {
                            bVar.f92261a = 1;
                        } else {
                            z13 = true;
                        }
                    }
                    if (bVar.f92285y < 0) {
                        bVar.f92261a = 1;
                    }
                }
            } else {
                bVar.f92261a = 2;
            }
            int i36 = bVar.f92285y;
            if (1 <= i36) {
                int i37 = 1;
                while (true) {
                    int i38 = bVar.f92284x + i23;
                    int i39 = bVar.f92285y;
                    int i43 = i38 % i39;
                    bVar.f92284x = i43;
                    if (i39 <= 0 || i43 < 0 || bVar.f92283w == null) {
                        bitmap = null;
                    } else {
                        a aVar3 = (a) bVar.f92280t.get(i43);
                        int[] iArr2 = aVar3.f92260k;
                        if (iArr2 == null) {
                            bVar.f92267g = bVar.f92266f;
                        } else {
                            bVar.f92267g = iArr2;
                            if (bVar.f92268h == aVar3.f92257h) {
                                bVar.f92269i = i19;
                            }
                        }
                        if (aVar3.f92255f) {
                            int[] iArr3 = bVar.f92267g;
                            int i44 = aVar3.f92257h;
                            i14 = iArr3[i44];
                            iArr3[i44] = i19;
                        } else {
                            i14 = i19;
                        }
                        if (bVar.f92267g == null) {
                            Log.w("b", "No Valid Color Table");
                            bVar.f92261a = i23;
                            bitmap = bitmap4;
                        } else {
                            int i45 = bVar.f92284x;
                            a aVar4 = (a) bVar.f92280t.get(i45);
                            int i46 = i45 - i23;
                            a aVar5 = i46 >= 0 ? (a) bVar.f92280t.get(i46) : bitmap4;
                            int[] iArr4 = bVar.f92278r;
                            if (aVar5 == 0 || (i18 = aVar5.f92256g) <= 0) {
                                i15 = 3;
                                iArr = iArr4;
                            } else {
                                if (i18 != i23 || (bitmap3 = bVar.f92283w) == null) {
                                    i15 = 3;
                                    iArr = iArr4;
                                } else {
                                    int i47 = bVar.f92262b;
                                    i15 = 3;
                                    iArr = iArr4;
                                    bitmap3.getPixels(iArr4, 0, i47, 0, 0, i47, bVar.f92263c);
                                }
                                if (aVar5.f92256g == i24) {
                                    int i48 = !aVar4.f92255f ? bVar.f92269i : 0;
                                    for (int i49 = 0; i49 < aVar5.f92253d; i49++) {
                                        int i53 = ((aVar5.f92251b + i49) * bVar.f92262b) + aVar5.f92250a;
                                        int i54 = aVar5.f92252c + i53;
                                        while (i53 < i54) {
                                            iArr[i53] = i48;
                                            i53++;
                                        }
                                    }
                                }
                                if (aVar5.f92256g == i15 && (bitmap2 = bVar.f92282v) != null) {
                                    int i55 = bVar.f92262b;
                                    bitmap2.getPixels(iArr, 0, i55, 0, 0, i55, bVar.f92263c);
                                }
                            }
                            bVar.a(aVar4, bVar.f92277q);
                            int i56 = 8;
                            int i57 = 0;
                            int i58 = 0;
                            int i59 = 1;
                            while (true) {
                                int i63 = aVar4.f92253d;
                                if (i57 >= i63) {
                                    break;
                                }
                                if (aVar4.f92254e) {
                                    if (i58 >= i63) {
                                        i59++;
                                        if (i59 == i24) {
                                            i58 = 4;
                                        } else if (i59 == i15) {
                                            i56 = 4;
                                            i58 = i24;
                                        } else if (i59 == 4) {
                                            i56 = i24;
                                            i58 = 1;
                                        }
                                    }
                                    i16 = i58 + i56;
                                } else {
                                    i16 = i58;
                                    i58 = i57;
                                }
                                int i64 = i58 + aVar4.f92251b;
                                if (i64 < bVar.f92263c) {
                                    int i65 = bVar.f92262b;
                                    int i66 = i64 * i65;
                                    int i67 = aVar4.f92250a + i66;
                                    int i68 = aVar4.f92252c;
                                    i17 = i56;
                                    int i69 = i67 + i68;
                                    int i73 = i66 + i65;
                                    if (i73 < i69) {
                                        i69 = i73;
                                    }
                                    int i74 = i68 * i57;
                                    while (i67 < i69) {
                                        int i75 = i74 + 1;
                                        int i76 = bVar.f92267g[bVar.f92277q[i74] & 255];
                                        if (i76 != 0) {
                                            iArr[i67] = i76;
                                        }
                                        i67++;
                                        i74 = i75;
                                    }
                                } else {
                                    i17 = i56;
                                }
                                i57++;
                                i58 = i16;
                                i56 = i17;
                                i15 = 3;
                                i24 = 2;
                            }
                            Bitmap bitmap5 = bVar.f92283w;
                            int[] iArr5 = bVar.f92279s;
                            int i77 = bVar.f92262b;
                            bitmap5.getPixels(iArr5, 0, i77, 0, 0, i77, bVar.f92263c);
                            Bitmap bitmap6 = bVar.f92282v;
                            int[] iArr6 = bVar.f92279s;
                            int i78 = bVar.f92262b;
                            bitmap6.setPixels(iArr6, 0, i78, 0, 0, i78, bVar.f92263c);
                            Bitmap bitmap7 = bVar.f92283w;
                            int i79 = bVar.f92262b;
                            bitmap7.setPixels(iArr, 0, i79, 0, 0, i79, bVar.f92263c);
                            if (aVar3.f92255f) {
                                bVar.f92267g[aVar3.f92257h] = i14;
                            }
                            bitmap = bVar.f92283w;
                        }
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                    Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                    int i83 = bVar.f92285y;
                    arrayList.add(new dw0.a((i83 <= 0 || (i13 = bVar.f92284x) < 0 || i13 < 0 || i13 >= i83) ? -1 : ((a) bVar.f92280t.get(i13)).f92258i, createBitmap));
                    if (i37 == i36) {
                        break;
                    }
                    i37++;
                    i19 = 0;
                    bitmap4 = null;
                    i23 = 1;
                    i24 = 2;
                }
            }
        }
        return arrayList;
    }

    public final void a(zq sticker, Function0 successCallback, Function0 errorCallback) {
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        Intrinsics.checkNotNullParameter(errorCallback, "errorCallback");
        if (d(sticker)) {
            successCallback.invoke();
            return;
        }
        String q13 = sticker.q();
        Intrinsics.checkNotNullExpressionValue(q13, "getCloseupImageURL(...)");
        this.f92290b.c(q13).r(e.f118017c).l(wj2.c.a()).o(new x(2, new r(this, sticker, successCallback, 10)), new x(3, new g1(23, this, errorCallback)));
    }

    public final File b(zq sticker) {
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        try {
            Context context = this.f92289a;
            Intrinsics.g(context, "null cannot be cast to non-null type android.app.Application");
            File file = new File(ph.a.z((Application) context, sticker));
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean d(zq sticker) {
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        try {
            Context context = this.f92289a;
            Intrinsics.g(context, "null cannot be cast to non-null type android.app.Application");
            return new File(ph.a.z((Application) context, sticker)).exists();
        } catch (Exception unused) {
            return false;
        }
    }
}
