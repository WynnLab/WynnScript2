parser grammar WynnScriptParser;

options { tokenVocab = WynnScriptLexer; }

wynnScript: LETTER* EOF;