package net.minecraft.server;

import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DebugReportRecipe implements DebugReportProvider {

    private static final Logger b = LogManager.getLogger();
    private static final Gson c = (new GsonBuilder()).setPrettyPrinting().create();
    private final DebugReportGenerator d;

    public DebugReportRecipe(DebugReportGenerator debugreportgenerator) {
        this.d = debugreportgenerator;
    }

    public void a(HashCache hashcache) throws IOException {
        java.nio.file.Path java_nio_file_path = this.d.b();
        HashSet hashset = Sets.newHashSet();

        this.a((debugreportrecipedata) -> {
            if (!set.add(debugreportrecipedata.b())) {
                throw new IllegalStateException("Duplicate recipe " + debugreportrecipedata.b());
            } else {
                this.a(hashcache, debugreportrecipedata.a(), java_nio_file_path.resolve("data/" + debugreportrecipedata.b().b() + "/recipes/" + debugreportrecipedata.b().getKey() + ".json"));
                JsonObject jsonobject = debugreportrecipedata.c();

                if (jsonobject != null) {
                    this.b(hashcache, jsonobject, java_nio_file_path.resolve("data/" + debugreportrecipedata.b().b() + "/advancements/" + debugreportrecipedata.d().getKey() + ".json"));
                }

            }
        });
        this.b(hashcache, Advancement.SerializedAdvancement.a().a("impossible", (CriterionInstance) (new CriterionTriggerImpossible.a())).b(), java_nio_file_path.resolve("data/minecraft/advancements/recipes/root.json"));
    }

    private void a(HashCache hashcache, JsonObject jsonobject, java.nio.file.Path java_nio_file_path) {
        try {
            String s = DebugReportRecipe.c.toJson(jsonobject);
            String s1 = DebugReportRecipe.a.hashUnencodedChars(s).toString();

            if (!Objects.equals(hashcache.a(java_nio_file_path), s1) || !Files.exists(java_nio_file_path, new LinkOption[0])) {
                Files.createDirectories(java_nio_file_path.getParent(), new FileAttribute[0]);
                BufferedWriter bufferedwriter = Files.newBufferedWriter(java_nio_file_path, new OpenOption[0]);
                Throwable throwable = null;

                try {
                    bufferedwriter.write(s);
                } catch (Throwable throwable1) {
                    throwable = throwable1;
                    throw throwable1;
                } finally {
                    if (bufferedwriter != null) {
                        if (throwable != null) {
                            try {
                                bufferedwriter.close();
                            } catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        } else {
                            bufferedwriter.close();
                        }
                    }

                }
            }

            hashcache.a(java_nio_file_path, s1);
        } catch (IOException ioexception) {
            DebugReportRecipe.b.error("Couldn\'t save recipe {}", java_nio_file_path, ioexception);
        }

    }

    private void b(HashCache hashcache, JsonObject jsonobject, java.nio.file.Path java_nio_file_path) {
        try {
            String s = DebugReportRecipe.c.toJson(jsonobject);
            String s1 = DebugReportRecipe.a.hashUnencodedChars(s).toString();

            if (!Objects.equals(hashcache.a(java_nio_file_path), s1) || !Files.exists(java_nio_file_path, new LinkOption[0])) {
                Files.createDirectories(java_nio_file_path.getParent(), new FileAttribute[0]);
                BufferedWriter bufferedwriter = Files.newBufferedWriter(java_nio_file_path, new OpenOption[0]);
                Throwable throwable = null;

                try {
                    bufferedwriter.write(s);
                } catch (Throwable throwable1) {
                    throwable = throwable1;
                    throw throwable1;
                } finally {
                    if (bufferedwriter != null) {
                        if (throwable != null) {
                            try {
                                bufferedwriter.close();
                            } catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        } else {
                            bufferedwriter.close();
                        }
                    }

                }
            }

            hashcache.a(java_nio_file_path, s1);
        } catch (IOException ioexception) {
            DebugReportRecipe.b.error("Couldn\'t save recipe advancement {}", java_nio_file_path, ioexception);
        }

    }

    private void a(Consumer<DebugReportRecipeData> param1) { // $FF: Couldn't be decompiled
    }

    private CriterionTriggerEnterBlock.b a(Block block) {
        return new CriterionTriggerEnterBlock.b(block, (Map) null);
    }

    private CriterionTriggerInventoryChanged.b a(CriterionConditionValue.d criterionconditionvalue_d, IMaterial imaterial) {
        return this.a(new CriterionConditionItem[] { CriterionConditionItem.a.a().a(imaterial).a(criterionconditionvalue_d).b()});
    }

    private CriterionTriggerInventoryChanged.b a(IMaterial imaterial) {
        return this.a(new CriterionConditionItem[] { CriterionConditionItem.a.a().a(imaterial).b()});
    }

    private CriterionTriggerInventoryChanged.b a(Tag<Item> tag) {
        return this.a(new CriterionConditionItem[] { CriterionConditionItem.a.a().a(tag).b()});
    }

    private CriterionTriggerInventoryChanged.b a(CriterionConditionItem... acriterionconditionitem) {
        return new CriterionTriggerInventoryChanged.b(CriterionConditionValue.d.e, CriterionConditionValue.d.e, CriterionConditionValue.d.e, acriterionconditionitem);
    }

    public String a() {
        return "Recipes";
    }
}
