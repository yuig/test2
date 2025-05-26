package j4;

import a.l9;
import android.text.Layout;
import android.text.TextPaint;
import b4.q0;
import b4.u;
import c4.o;
import i2.v3;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Pair;
import v.j2;

/* loaded from: classes3.dex */
public final class d implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f74559a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f74560b;

    /* renamed from: c, reason: collision with root package name */
    public final List f74561c;

    /* renamed from: d, reason: collision with root package name */
    public final List f74562d;

    /* renamed from: e, reason: collision with root package name */
    public final g4.d f74563e;

    /* renamed from: f, reason: collision with root package name */
    public final n4.b f74564f;

    /* renamed from: g, reason: collision with root package name */
    public final e f74565g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f74566h;

    /* renamed from: i, reason: collision with root package name */
    public final o f74567i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.appcompat.app.d f74568j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f74569k;

    /* renamed from: l, reason: collision with root package name */
    public final int f74570l;

    /* JADX WARN: Code restructure failed: missing block: B:396:0x00bc, code lost:
    
        if (r8 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0342, code lost:
    
        if (kh2.w.k0(r4.f21649b.f21666c) == false) goto L169;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0148 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ca  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(b4.q0 r41, g4.d r42, n4.b r43, java.lang.String r44, java.util.List r45, java.util.List r46) {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.d.<init>(b4.q0, g4.d, n4.b, java.lang.String, java.util.List, java.util.List):void");
    }

    @Override // b4.u
    public final boolean a() {
        androidx.appcompat.app.d dVar = this.f74568j;
        if (dVar == null || !dVar.G()) {
            if (!this.f74569k && l9.e(this.f74560b)) {
                h hVar = j.f74585a;
                h hVar2 = j.f74585a;
                v3 v3Var = hVar2.f74583a;
                if (v3Var == null) {
                    if (h6.m.c()) {
                        v3Var = hVar2.a();
                        hVar2.f74583a = v3Var;
                    } else {
                        v3Var = k.f74586a;
                    }
                }
                if (((Boolean) v3Var.getValue()).booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // b4.u
    public final float b() {
        return this.f74567i.b();
    }

    @Override // b4.u
    public final float c() {
        o oVar = this.f74567i;
        if (!Float.isNaN(oVar.f25657e)) {
            return oVar.f25657e;
        }
        TextPaint textPaint = oVar.f25654b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = oVar.f25653a;
        lineInstance.setText(new c4.j(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new j2(2));
        int i13 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i13), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.f80347b).intValue() - ((Number) pair.f80346a).intValue() < next - i13) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i13), Integer.valueOf(next)));
                }
            }
            i13 = next;
        }
        Iterator it = priorityQueue.iterator();
        float f13 = 0.0f;
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            f13 = Math.max(f13, Layout.getDesiredWidth(charSequence, ((Number) pair2.f80346a).intValue(), ((Number) pair2.f80347b).intValue(), textPaint));
        }
        oVar.f25657e = f13;
        return f13;
    }
}
