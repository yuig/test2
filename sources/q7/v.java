package q7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public List f102687a;

    /* renamed from: b, reason: collision with root package name */
    public List f102688b;

    /* renamed from: c, reason: collision with root package name */
    public List f102689c;

    public v(int i13, ArrayList grantedPermissions, ArrayList declinedPermissions, ArrayList expiredPermissions) {
        if (i13 != 2) {
            this.f102687a = grantedPermissions;
            this.f102688b = declinedPermissions;
            this.f102689c = expiredPermissions;
        } else {
            Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
            Intrinsics.checkNotNullParameter(declinedPermissions, "declinedPermissions");
            Intrinsics.checkNotNullParameter(expiredPermissions, "expiredPermissions");
            this.f102687a = grantedPermissions;
            this.f102688b = declinedPermissions;
            this.f102689c = expiredPermissions;
        }
    }

    public static v b(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int i13 = 0;
        while (i13 < str.length()) {
            int indexOf = str.indexOf("$", i13);
            if (indexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + str.substring(i13));
                i13 = str.length();
            } else if (indexOf != i13) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + str.substring(i13, indexOf));
                i13 = indexOf;
            } else if (str.startsWith("$$", i13)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                i13 += 2;
            } else {
                arrayList3.add("");
                int i14 = i13 + 1;
                int indexOf2 = str.indexOf("$", i14);
                String substring = str.substring(i14, indexOf2);
                if (substring.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.getClass();
                    switch (substring) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(str));
                    }
                    arrayList3.set(arrayList2.size() - 1, str2);
                }
                arrayList.add("");
                i13 = indexOf2 + 1;
            }
        }
        return new v(0, arrayList, arrayList2, arrayList3);
    }

    public final String a(String str, long j13, int i13, long j14) {
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < this.f102688b.size(); i14++) {
            sb3.append((String) this.f102687a.get(i14));
            if (((Integer) this.f102688b.get(i14)).intValue() == 1) {
                sb3.append(str);
            } else if (((Integer) this.f102688b.get(i14)).intValue() == 2) {
                sb3.append(String.format(Locale.US, (String) this.f102689c.get(i14), Long.valueOf(j13)));
            } else if (((Integer) this.f102688b.get(i14)).intValue() == 3) {
                sb3.append(String.format(Locale.US, (String) this.f102689c.get(i14), Integer.valueOf(i13)));
            } else if (((Integer) this.f102688b.get(i14)).intValue() == 4) {
                sb3.append(String.format(Locale.US, (String) this.f102689c.get(i14), Long.valueOf(j14)));
            }
        }
        sb3.append((String) this.f102687a.get(this.f102688b.size()));
        return sb3.toString();
    }

    public final List c() {
        return this.f102687a;
    }

    public final List d() {
        return this.f102689c;
    }

    public final List e() {
        return this.f102688b;
    }
}
