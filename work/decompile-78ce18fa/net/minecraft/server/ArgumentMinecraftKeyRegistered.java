package net.minecraft.server;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

public class ArgumentMinecraftKeyRegistered implements ArgumentType<MinecraftKey> {

    private static final Collection<String> d = Arrays.asList(new String[] { "foo", "foo:bar", "012"});
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType((object) -> {
        return new ChatMessage("argument.id.unknown", new Object[] { object});
    });
    public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType((object) -> {
        return new ChatMessage("advancement.advancementNotFound", new Object[] { object});
    });
    public static final DynamicCommandExceptionType c = new DynamicCommandExceptionType((object) -> {
        return new ChatMessage("recipe.notFound", new Object[] { object});
    });

    public ArgumentMinecraftKeyRegistered() {}

    public static ArgumentMinecraftKeyRegistered a() {
        return new ArgumentMinecraftKeyRegistered();
    }

    public static Advancement a(CommandContext<CommandListenerWrapper> commandcontext, String s) throws CommandSyntaxException {
        MinecraftKey minecraftkey = (MinecraftKey) commandcontext.getArgument(s, MinecraftKey.class);
        Advancement advancement = ((CommandListenerWrapper) commandcontext.getSource()).getServer().getAdvancementData().a(minecraftkey);

        if (advancement == null) {
            throw ArgumentMinecraftKeyRegistered.b.create(minecraftkey);
        } else {
            return advancement;
        }
    }

    public static IRecipe b(CommandContext<CommandListenerWrapper> commandcontext, String s) throws CommandSyntaxException {
        MinecraftKey minecraftkey = (MinecraftKey) commandcontext.getArgument(s, MinecraftKey.class);
        IRecipe irecipe = ((CommandListenerWrapper) commandcontext.getSource()).getServer().getCraftingManager().a(minecraftkey);

        if (irecipe == null) {
            throw ArgumentMinecraftKeyRegistered.c.create(minecraftkey);
        } else {
            return irecipe;
        }
    }

    public static MinecraftKey c(CommandContext<CommandListenerWrapper> commandcontext, String s) {
        return (MinecraftKey) commandcontext.getArgument(s, MinecraftKey.class);
    }

    public MinecraftKey a(StringReader stringreader) throws CommandSyntaxException {
        return MinecraftKey.a(stringreader);
    }

    public Collection<String> getExamples() {
        return ArgumentMinecraftKeyRegistered.d;
    }

    public Object parse(StringReader stringreader) throws CommandSyntaxException {
        return this.a(stringreader);
    }
}
